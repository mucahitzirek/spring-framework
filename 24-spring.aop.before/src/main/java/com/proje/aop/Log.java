package com.proje.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	@Before("execution (public void com.proje.repository.ProductRepository.saveProduct(*))")
	public void beforeAdvice() {

		System.out.println("Veri kaydetme işlemi basliyor.");
	}

//	@Before("execution (public * com.proje.repository.ProductRepository.deleteProduct(*))")
//	@Before("execution (public * com.proje.repository.*.deleteProduct(*))")
//	@Before("execution (public * findProducts())")
//	@Before("execution (* findProduct(*))")
	@Before("execution (* findProduct(..))")

	public void before2Advice() {

		System.out.println("Veri silme işlemi başlıyor");

	}

}
