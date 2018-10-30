package com.aop.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:wjy
 * @Date: 2018/10/30.
 */
public class BookFaceProxy implements InvocationHandler {

	private Object target;


	public Object bind(Object target){
		this.target = target;
		System.out.println("-----------bind------");
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("----------->【任务执行前】<-----------");
		result = method.invoke(target,args);
		System.out.println("----------->【任务结束】<-----------");
		return result;
	}

}
