package lab.sharding.jdbc;

import lab.sharding.jdbc.domain.LotteryOrder;
import lab.sharding.jdbc.service.LotteryOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * * @Author: Martin
 * * @Date    2024/4/6 15:50
 * * @Description 💧加油，别放弃！
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingTest {

    @Resource
    private LotteryOrderService orderService;


    @Test
    public void test1() {
        LotteryOrder lotteryOrder = new LotteryOrder();
        lotteryOrder.setId("898989989");
        lotteryOrder.setOrderNo(123);
        lotteryOrder.setPrice(new BigDecimal("19.9"));
        lotteryOrder.setUserId("123123");
        lotteryOrder.setCreateDate(new Date());

        boolean saved = orderService.save(lotteryOrder);
        System.out.println("saved = " + saved);
    }

}
