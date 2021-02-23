package com.coursejava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}