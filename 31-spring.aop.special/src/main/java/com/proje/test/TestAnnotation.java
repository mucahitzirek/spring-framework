package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.model.Product;
import com.proje.repository.ProductRepository;

public class TestAnnotation {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductRepository productRepository = applicationContext.getBean("productRepository", ProductRepository.class);

		Product product = new Product("Iphone 7", 3500, 2, "TELEFON");

		productRepository.saveProduct(product);

		applicationContext.close();

	}

}
