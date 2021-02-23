package com.coursejava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}