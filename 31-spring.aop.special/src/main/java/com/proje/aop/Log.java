package com.proje.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

	@Around("@annotation(com.proje.aop.LogAnnotation)")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

		try {
			System.out.println("Around basladi : " + proceedingJoinPoint);

			proceedingJoinPoint.proceed();

			System.out.println("Arround bitti : " + proceedingJoinPoint);

		} catch (Throwable e) {
			System.out.println("Hata : " + e);
		}

	}

	@Pointcut("within (com.proje.repository.*)")
	public void pointCutRepository() {

	}

}
