package lab.sharding.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * * @Author: Martin
 * * @Date    2024/4/5 23:27
 * * @Description 💧加油，别放弃！
 **/
@MapperScan(basePackages = "lab.sharding.jdbc.mapper")
@SpringBootApplication
public class ShardingJdbcLabApp {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcLabApp.class);
    }

}
