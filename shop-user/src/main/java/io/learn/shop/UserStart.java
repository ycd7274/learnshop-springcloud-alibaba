package io.learn.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @projectName: shop
 * @package: io.learn.shop.user
 * @className: UserStart
 * @author: ycd20
 * @description: start user service
 * @date: 2022/10/27 22:37
 * @version: 1.0
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(value = {"io.learn.shop.user.mapper"})
public class UserStart {
    public static void main(String[] args) {
        SpringApplication.run(UserStart.class, args);
    }
}