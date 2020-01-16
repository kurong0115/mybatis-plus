package cn.kurong.mapper;

import cn.kurong.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserEntityMapper
 * @Description 用户实体类
 * @Author Administrator
 * @Date 2020/1/16 9:25
 * @Version 1.0
 */
@Repository
public interface UserEntityMapper extends BaseMapper<UserEntity> {

	/**
	 * 查询所有的用户
	 * @param userEntityIPage 分页属性
	 * @return
	 */
	@Select("select * from user")
	List<UserEntity> listAllUserEntity(IPage<UserEntity> userEntityIPage);

}
