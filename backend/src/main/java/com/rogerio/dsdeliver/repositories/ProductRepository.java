package com.rogerio.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerio.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	// SpringJPA ordenar por nome -> spring data jpa
	List<Product> findAllByOrderByNameAsc();

}
