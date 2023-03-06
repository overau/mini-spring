package com.sanfen.springframework.beans.factory;

import com.sanfen.springframework.beans.BeansException;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:52
 */
public interface BeanFactory {

    /**
     * 根据名称获取bean对象
     * @param name bean的名称
     * @return bean对象
     * @throws BeansException 获取bean异常
     */
    Object getBean(String name) throws BeansException;

}