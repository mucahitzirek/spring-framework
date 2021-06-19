package com.proje.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.proje.model.Product;

@Component
public class ProductRepository {

	private List<Product> products = new ArrayList<Product>();

	public void saveProduct(Product product) {
		System.out.println("Ürün eklendi.");
		this.products.add(product);
	}

	public void deleteProduct(Product product) {

		if (product == null) {
			
			throw new NullPointerException("Silinmek istenen deger : " + product);
		}

		this.products.remove(product);

	}

	public Product findProduct(int index) {

		if (index < 0) {

			throw new IllegalArgumentException("Geçersiz bir index değeri" + index);
		}

		Product product = this.products.get(index);

		return product;

	}

	public void findProducts() {
		for (Product product : products) {
			System.out.println(product);
		}

	}

}
