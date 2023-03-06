package com.sanfen.springframework.test;

import com.sanfen.springframework.bean.UserService;
import com.sanfen.springframework.beans.factory.config.BeanDefinition;
import com.sanfen.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 9:44
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        String beanName = "userService";
        beanFactory.registerBeanDefinition(beanName, beanDefinition);
        UserService userService = (UserService) beanFactory.getBean(beanName);
        userService.queryUserInfo();

        UserService userServiceSingleton = (UserService) beanFactory.getBean(beanName);
        userServiceSingleton.queryUserInfo();

        System.out.println(userService + " == " + userServiceSingleton);
    }

}
