package com.book.page92;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceCheckAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		String methodName = invocation.getMethod().getName();
		long startTime = System.nanoTime();
		System.out.println("[Log]METHOD Before -->"
				+ methodName + " time check start");
		Object obj = null;
		try {
			obj = invocation.proceed();
		} catch (Exception e) {
			System.out.println("[Log]METHOD error -->" + methodName);
		}

		long endTime = System.nanoTime();
		System.out.println("[Log]METHOD after --> " 
				+ methodName + "time check end");
		System.out.println("[Log]" + methodName + 
				"Processing time is" + (endTime - startTime) + "ns");
		return obj;
	}

}
