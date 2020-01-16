package cn.kurong.service;

import cn.kurong.entity.UserEntity;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @ClassName UserEntityService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/1/16 9:26
 * @Version 1.0
 */
public interface UserEntityService extends IService<UserEntity> {

	/**
	 * 分页查询用户信息
	 * @param page 分页信息
	 * @param wrapper 条件查询构造器
	 * @return
	 */
	IPage<UserEntity> listUserEntityByPage(IPage<UserEntity> page, Wrapper<UserEntity> wrapper);
}
