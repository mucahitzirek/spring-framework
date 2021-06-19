package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.model.Product;
import com.proje.repository.ProductRepository;

public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		ProductRepository productRepository = applicationContext.getBean("productRepository", ProductRepository.class);

		Product product = new Product("Iphone 7", 3500, 2, "TELEFON");

		productRepository.saveProduct(product);

		System.out.println("---------------");

		productRepository.findProducts();

		System.out.println("***********");

		productRepository.findProduct(0);

		applicationContext.close();

	}

}
