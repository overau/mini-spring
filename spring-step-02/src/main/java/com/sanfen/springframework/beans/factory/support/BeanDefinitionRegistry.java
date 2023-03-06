package com.sanfen.springframework.beans.factory.support;

import com.sanfen.springframework.beans.factory.config.BeanDefinition;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:56
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册BeanDefinition
     * @param beanName bean的名称
     * @param beanDefinition bean的定义信息
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}