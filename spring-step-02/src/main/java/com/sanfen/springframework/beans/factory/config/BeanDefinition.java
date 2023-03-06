package com.sanfen.springframework.beans.factory.config;

/**
 * bean对象定义
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:50
 */
public class BeanDefinition {

    private Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }
}