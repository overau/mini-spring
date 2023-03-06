package com.sanfen.springframework.beans.factory.support;

import com.sanfen.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:57
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 根据bean的名称获取bean对象
     *
     * @param beanName bean的名称
     * @return 单例bean对象
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 注册单例对象
     *
     * @param beanName        bean的名称
     * @param singletonObject 单例对象
     */
    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
