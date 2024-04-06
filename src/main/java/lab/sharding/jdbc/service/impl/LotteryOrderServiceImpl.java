package lab.sharding.jdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lab.sharding.jdbc.domain.LotteryOrder;
import lab.sharding.jdbc.service.LotteryOrderService;
import lab.sharding.jdbc.mapper.LotteryOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author jack
* @description 针对表【lottery_order_0】的数据库操作Service实现
* @createDate 2024-04-06 15:49:17
*/
@Service
public class LotteryOrderServiceImpl extends ServiceImpl<LotteryOrderMapper, LotteryOrder>
    implements LotteryOrderService{

}




