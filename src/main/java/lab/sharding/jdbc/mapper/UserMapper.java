package lab.sharding.jdbc.mapper;

import lab.sharding.jdbc.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author jack
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2024-04-06 16:23:30
* @Entity lab.sharding.jdbc.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




