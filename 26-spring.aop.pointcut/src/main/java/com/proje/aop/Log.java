package com.proje.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	@Before("pointCutProductRepository()")
	public void beforeAdvice() {
		System.out.println("Veri kaydetme işlemi basladi.");

	}

	@After("pointCutProductRepository()")
	public void afterAdvice() {
		System.out.println("Veri kaydetme işlemi bitti.");

	}

//	@Pointcut("within (com.proje.repository.ProductRepository)")
//	@Pointcut("within (com.proje.repository.*)")
//	@Pointcut("within (com.proje.*.ProductRepository)")
	
	@Pointcut("within (com.proje.. )")
	public void pointCutProductRepository() {

	}

}
