package com.sanfen.springframework.beans.factory.support;

import com.sanfen.springframework.beans.BeansException;
import com.sanfen.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:56
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    /**
     * 根据名称获取BeanDefinition
     *
     * @param beanName bean的名称
     * @return BeanDefinition
     * @throws BeansException BeansException
     */
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null){
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    /**
     * 注册BeanDefinition
     *
     * @param beanName       bean的名称
     * @param beanDefinition bean的定义信息
     */
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

}
