package com.wonder.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAOP {
	@Pointcut("execution(* com.wonder.controller..*.*(..))")  
	private void execute(){}//����һ�������  

	@Before("execute() && args(name)")  
	public void doAccessCheck(String name){  
		System.out.println(name);  
		System.out.println("ǰ��֪ͨ");  
	}  

	@AfterReturning("execute()")  
	public void doAfter(){  
		System.out.println("����֪ͨ");  
	}  

	@After("execute()")  
	public void after(){  
		System.out.println("����֪ͨ");  
	}  

	@AfterThrowing("execute()")  
	public void doAfterThrow(){  
		System.out.println("����֪ͨ");  
	}  

	@Around("execute()")  
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
		System.out.println("���뻷��֪ͨ");  
		Object object = pjp.proceed();//ִ�и÷���  
		System.out.println("�˳�����");  
		return null;  
	}  
}
