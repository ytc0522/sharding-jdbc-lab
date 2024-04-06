package lab.sharding.jdbc;

import lab.sharding.jdbc.domain.Dict;
import lab.sharding.jdbc.domain.LotteryOrder;
import lab.sharding.jdbc.domain.User;
import lab.sharding.jdbc.service.DictService;
import lab.sharding.jdbc.service.LotteryOrderService;
import lab.sharding.jdbc.service.UserService;
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
    @Resource
    private UserService userService;
    @Resource
    private DictService dictService;


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

    /**
     * 用户表没有做分片，就一张表，专库专表
     */
    @Test
    public void userTest() {
        User user = new User();
        user.setUserAge(10);
        user.setCreateDate(new Date());
        user.setUserName("王八犊子");
        user.setCreateDate(new Date());

        userService.save(user);
    }

    @Test
    public void dictSaveTest() {
        Dict dict = new Dict();
        dict.setDictKey("test-key");
        dict.setStatus(1);
        dict.setDictValue("test-value");

        dictService.save(dict);
    }

    @Test
    public void dictDeleteTest() {
        boolean success = dictService.removeById(126978);
        System.out.println("success = " + success);
    }

}
