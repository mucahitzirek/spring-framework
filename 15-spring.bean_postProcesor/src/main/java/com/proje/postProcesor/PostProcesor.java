package com.proje.postProcesor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.proje.db.DBConnection;

public class PostProcesor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("Bean Olusturulmadan once : " + beanName + " : " + bean);

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof DBConnection) {
			System.out.println("Olusturulan bean db Connection Turunde.");
		}

		System.out.println("Bean Olusturulmadan onceBean Olusturulduktan sonra  : " + beanName + " : " + bean);

		return bean;
	}

}
