package cn.kurong;

import cn.kurong.entity.User;
import cn.kurong.mapper.UserMapper;
import cn.kurong.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

	@Autowired
	IUserService userService;

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
}
