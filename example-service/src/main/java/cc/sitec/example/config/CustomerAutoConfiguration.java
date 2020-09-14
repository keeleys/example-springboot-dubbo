package cc.sitec.example.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 *@author 凉水
 *@date 2020/5/28 9:57
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(CustomerImportSelector.class)
public @interface CustomerAutoConfiguration {
    Class<?>[] value() default {};
}