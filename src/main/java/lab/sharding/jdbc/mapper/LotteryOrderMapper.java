package lab.sharding.jdbc.mapper;

import lab.sharding.jdbc.domain.LotteryOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author jack
* @description 针对表【lottery_order_0】的数据库操作Mapper
* @createDate 2024-04-06 15:49:17
* @Entity lab.sharding.jdbc.domain.LotteryOrder
*/
@Mapper
public interface LotteryOrderMapper extends BaseMapper<LotteryOrder> {

}




