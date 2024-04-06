package lab.sharding.jdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.sharding.jdbc.domain.User;
import lab.sharding.jdbc.service.UserService;
import lab.sharding.jdbc.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author jack
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2024-04-06 16:23:30
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




