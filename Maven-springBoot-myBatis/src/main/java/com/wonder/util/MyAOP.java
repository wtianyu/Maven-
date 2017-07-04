package com.wonder.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAOP {
	@Pointcut("execution(* com.wonder.controller..*.*(..))")  
	private void execute(){}//定义一个切入点  

	@Before("execute() && args(name)")  
	public void doAccessCheck(String name){  
		System.out.println(name);  
		System.out.println("前置通知");  
	}  

	@AfterReturning("execute()")  
	public void doAfter(){  
		System.out.println("后置通知");  
	}  

	@After("execute()")  
	public void after(){  
		System.out.println("最终通知");  
	}  

	@AfterThrowing("execute()")  
	public void doAfterThrow(){  
		System.out.println("例外通知");  
	}  

	@Around("execute()")  
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
		System.out.println("进入环绕通知");  
		Object object = pjp.proceed();//执行该方法  
		System.out.println("退出方法");  
		return null;  
	}  
}
