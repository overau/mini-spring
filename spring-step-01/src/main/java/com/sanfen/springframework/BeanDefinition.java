package com.sanfen.springframework;

/**
 * Bean对象的定义信息
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 9:34
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
