package com.proje.bean_factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("ApplicationContext.xmk dostasi okunurken Beanlar context'e yuklenirken calisti");
		System.out.println("Tamamlanan Bean sayisi : " + beanFactory.getBeanDefinitionCount());

		System.out.println("------------------------");

	}

}
