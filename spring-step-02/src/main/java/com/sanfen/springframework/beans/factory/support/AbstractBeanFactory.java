package com.sanfen.springframework.beans.factory.support;

import com.sanfen.springframework.beans.BeansException;
import com.sanfen.springframework.beans.factory.BeanFactory;
import com.sanfen.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanFactory抽象类定义模板方法
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:53
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    /**
     * 根据名称获取bean对象
     *
     * @param name bean的名称
     * @return bean对象
     * @throws BeansException 获取bean异常
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 根据名称获取BeanDefinition
     * @param beanName bean的名称
     * @return BeanDefinition
     * @throws BeansException BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 根据BeanDefinition创建bean对象
     * @param beanName bean的名称
     * @param beanDefinition bean定义信息
     * @return bean对象
     * @throws BeansException BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
