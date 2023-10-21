package com.lagou.edu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor() {
		System.out.println("BeanPostProcessor实现类构造函数。。。。");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("LagouBean".equalsIgnoreCase(beanName)){
			System.out.println("BeanPostProcessor的实现类 postProcessBeforeInitialization方法贝调用。。。。");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("LagouBean".equalsIgnoreCase(beanName)){
			System.out.println("BeanPostProcessor的实现类 postProcessAfterInitialization。。。。");
		}
		return bean;
	}
}
