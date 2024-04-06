package lab.sharding.jdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.sharding.jdbc.domain.Dict;
import lab.sharding.jdbc.service.DictService;
import lab.sharding.jdbc.mapper.DictMapper;
import org.springframework.stereotype.Service;

/**
* @author jack
* @description 针对表【t_dict】的数据库操作Service实现
* @createDate 2024-04-06 17:07:30
*/
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict>
    implements DictService{

}




