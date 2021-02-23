package com.coursejava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}