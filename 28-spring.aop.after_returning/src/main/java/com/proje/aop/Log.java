package com.proje.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.proje.model.Product;

@Aspect
@Component
public class Log {

	@AfterReturning(pointcut = "execution (public * com.proje.repository.*.findProduct(*))", returning = "product")
	public void afterReturningAdvice(JoinPoint joinPoint, Product product) {

		System.out.println("Method return ettikten sonra başliyor. " + joinPoint);
		System.out.println("Return edilen deger : " + product);

	}

}
