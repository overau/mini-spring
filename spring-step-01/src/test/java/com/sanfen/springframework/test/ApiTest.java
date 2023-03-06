package com.sanfen.springframework.test;

import com.sanfen.springframework.BeanDefinition;
import com.sanfen.springframework.BeanFactory;
import com.sanfen.springframework.bean.UserService;
import org.junit.Test;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 9:44
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.准备bean对象的定义信息
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        // 2.将bean对象的定义信息注册到BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.从BeanFactory获取bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
