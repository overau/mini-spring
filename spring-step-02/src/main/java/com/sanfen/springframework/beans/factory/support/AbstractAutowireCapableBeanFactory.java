package com.sanfen.springframework.beans.factory.support;

import com.sanfen.springframework.beans.BeansException;
import com.sanfen.springframework.beans.factory.config.BeanDefinition;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:55
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    /**
     * 根据BeanDefinition创建bean对象
     *
     * @param beanName       bean的名称
     * @param beanDefinition bean定义信息
     * @return bean对象
     * @throws BeansException BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        registerSingleton(beanName, bean);
        return bean;
    }

}
