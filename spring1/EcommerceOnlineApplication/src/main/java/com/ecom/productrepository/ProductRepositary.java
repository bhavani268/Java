package com.ecom.productrepository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.pojo.Product;

public interface ProductRepositary extends JpaRepository<Product,Long>{
	List<Product> findByDate(String date);
	List<Product> findByName(String name);

}