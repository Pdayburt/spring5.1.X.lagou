package com.lagou.edu;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public class LagouBean implements InitializingBean {

	public LagouBean() {
		System.out.println("LagouBean 构造器......");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LagouBean afterPropertiesSet.......");
	}
}
