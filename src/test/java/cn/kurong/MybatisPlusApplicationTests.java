package cn.kurong;

import cn.kurong.entity.User;
import cn.kurong.entity.UserEntity;
import cn.kurong.mapper.UserEntityMapper;
import cn.kurong.service.IUserService;
import cn.kurong.service.UserEntityService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

	@Autowired
	IUserService userService;

	@Autowired
	UserEntityService userEntityService;

	@Autowired
	UserEntityMapper userEntityMapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void listUserTest() {
		List<User> userList = userService.list();
		userList.stream().forEach(System.out::println);
	}

	@Test
	public void saveUserTest() {
		userService.save(new User().setAge(21).setEmail("1181209156@qq.com"));
	}

	@Test
	public void saveUserBatchTest() {
		List<User> userList = new ArrayList<>();
//		userService.saveOrUpdate(userList.get(0), new QueryWrapper<User>().eq("age", 21));
		userList.add(new User().setAge(21).setEmail("1181209156@qq.com"));
		userList.add(new User().setAge(22).setEmail("1181209156@qq.com"));
		userList.add(new User().setAge(23).setEmail("1181209156@qq.com"));
		userList.add(new User().setAge(24).setEmail("1181209156@qq.com"));
		userList.add(new User().setAge(25).setEmail("1181209156@qq.com"));
		userList.add(new User().setAge(26).setEmail("1181209156@qq.com"));
		userList.add(new User().setAge(27).setEmail("1181209156@qq.com"));
		userService.saveOrUpdateBatch(userList);
	}

	@Test
	public void listUserWrapperTest() {
		List<User> userList = userService.list(new QueryWrapper<User>().ge("age", 21).likeRight("name", "枯荣"));
		userList.stream().forEach(System.out::println);
	}

	@Test
	public void enumTest() {
		List<UserEntity> userList = userEntityService.list();
		userList.stream().forEach(System.out::println);

	}

	@Test
	public void queryUserForPage() {
		IPage<UserEntity> userPage = userEntityService.listUserEntityByPage(new Page<>(2, 3), null);
		List<UserEntity> list = userPage.getRecords();
		list.stream().forEach(System.out::println);
	}

	@Test
	public void listAllUserEntity() {
		IPage<UserEntity> pageInfo = new Page<>(2, 3);
		pageInfo.setRecords(userEntityMapper.listAllUserEntity(pageInfo));
		pageInfo.getRecords().stream().forEach(System.out::println);
	}
}
