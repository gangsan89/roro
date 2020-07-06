package com.book.page92;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeLogAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[Log]METHOD Before:"
				+ method.getName()+" on "+target+" calling --" +args);
	}

}
