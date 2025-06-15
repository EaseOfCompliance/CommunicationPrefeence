package com.app.eom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eom.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
