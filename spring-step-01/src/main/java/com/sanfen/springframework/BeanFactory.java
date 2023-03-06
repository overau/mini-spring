package com.sanfen.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean工厂
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 9:36
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }

}
