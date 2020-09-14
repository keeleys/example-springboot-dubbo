package cc.sitec.example.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *@author 凉水
 *@date 2020/5/27 17:55
 **/
@Configuration
//@CustomerAutoConfiguration({
//        AopAutoConfiguration.class,
//        DataSourceAutoConfiguration.class,
//        TransactionAutoConfiguration.class,
//        DataSourceTransactionManagerAutoConfiguration.class,
//        // 设置 CharacterEncodingFilter
//        MybatisPlusAutoConfiguration.class,
//        DubboAutoConfiguration.class
//
//})
@EnableAutoConfiguration
@ComponentScan("cc.sitec.example")
@MapperScan("cc.sitec.example.dao")
public class ServiceConfig {

}