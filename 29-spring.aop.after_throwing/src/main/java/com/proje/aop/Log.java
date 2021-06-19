package com.proje.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Log {

	@AfterThrowing(pointcut = "execution (public * com.proje.repository.*.findProduct(*))", throwing = "exception")
	public void afterThrowingAdvice(JoinPoint joinPoint, IllegalArgumentException exception) {

		System.out.println("Method throw ettikten sonra başliyor . " + joinPoint);

		System.out.println("Hata : " + exception);
	}

}
