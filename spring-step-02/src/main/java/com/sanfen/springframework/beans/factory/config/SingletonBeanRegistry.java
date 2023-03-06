package com.sanfen.springframework.beans.factory.config;

/**
 * 单例对象注册接口
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:52
 */
public interface SingletonBeanRegistry {

    /**
     * 根据bean的名称获取bean对象
     * @param beanName bean的名称
     * @return 单例bean对象
     */
    Object getSingleton(String beanName);

    /**
     * 注册单例对象
     * @param beanName bean的名称
     * @param singletonObject 单例对象
     */
    void registerSingleton(String beanName, Object singletonObject);

}