package com.myRetail.restfull.myRetail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myRetail.restfull.myRetail.dao.ProductNameDao;
import com.myRetail.restfull.myRetail.model.ProductName;

@Service
public class ProductNameService {
	@Autowired
	private ProductNameDao productRepository;
	
	public ProductName getProductById(int id) {
		System.out.println(id);
		System.out.println(productRepository.findOne(String.valueOf(id)));
		return productRepository.findOne(String.valueOf(id));
		
	}

}
