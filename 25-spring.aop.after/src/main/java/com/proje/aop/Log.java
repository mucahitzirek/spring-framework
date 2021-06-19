package com.proje.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {
	
	
	@Before("execution (public void com.proje.repository.ProductRepository.saveProduct(*))")
	public void beforeAdvice() {
		System.out.println("Veri kaydetme işlemi basladi.");

	}

	@After("execution (public void com.proje.repository.ProductRepository.saveProduct(*))")
	public void afterAdvice() {
		System.out.println("Veri kaydetme işlemi bitti.");

	}

//	@ After("execution (public * com.proje.repository.ProductRepository.deleteProduct(*))")
//	@After("execution (public * com.proje.repository.*.deleteProduct(*))")
//	@After("execution (public * findProducts())")
//	@After("execution (* findProduct(*))")

	@After("execution (* findProduct(..))")
	public void before2Advice() {

		System.out.println("Veri silme işlemi başlıyor");

	}

}
