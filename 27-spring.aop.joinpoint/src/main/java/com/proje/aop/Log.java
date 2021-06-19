package com.proje.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	/*
	 * joinPoint.toString() - > hangi methoudn calistigini belirtir. execution(void
	 * com.proje.repository.ProductRepository.saveProduct(Product))
	 * 
	 * joinPoint.getKind() - > ne tüt aop islem yapildigini belirtir.
	 * method-execution,
	 *
	 * joinPoint.getSignature() - > çalıan methodun tam adresini verir. void
	 * com.proje.repository.ProductRepository.saveProduct(Product)
	 * 
	 * 
	 */

	@Before("pointCutProductRepository()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("İşlem Başlıyor : " + joinPoint.getTarget());

	}

	@After("pointCutProductRepository()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("İşlem bitiyor : " + joinPoint);

	}

//	@Pointcut("within (com.proje.repository.ProductRepository)")
//	@Pointcut("within (com.proje.repository.*)")
//	@Pointcut("within (com.proje.*.ProductRepository)")

	@Pointcut("within (com.proje.*.ProductRepository)")
	public void pointCutProductRepository() {

	}

}
