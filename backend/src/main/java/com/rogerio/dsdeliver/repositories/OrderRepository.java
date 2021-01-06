package com.rogerio.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerio.dsdeliver.entities.Product;

public interface OrderRepository extends JpaRepository<Product, Long>{

}
