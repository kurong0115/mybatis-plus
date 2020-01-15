package cn.kurong.service.impl;

import cn.kurong.entity.User;
import cn.kurong.mapper.UserMapper;
import cn.kurong.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Rong Ku
 * @since 2020-01-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
