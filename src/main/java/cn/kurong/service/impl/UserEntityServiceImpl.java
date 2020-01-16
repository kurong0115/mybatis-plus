package cn.kurong.service.impl;

import cn.kurong.entity.UserEntity;
import cn.kurong.mapper.UserEntityMapper;
import cn.kurong.service.UserEntityService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserEntityServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/1/16 9:27
 * @Version 1.0
 */
@Service
public class UserEntityServiceImpl extends ServiceImpl<UserEntityMapper, UserEntity> implements UserEntityService {

	@Autowired
	UserEntityMapper userEntityMapper;

	@Override
	public IPage<UserEntity> listUserEntityByPage(IPage<UserEntity> page, Wrapper<UserEntity> wrapper) {
		return userEntityMapper.selectPage(page, wrapper);
	}
}
