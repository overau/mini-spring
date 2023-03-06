package com.sanfen.springframework.beans;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/06 10:50
 */
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
