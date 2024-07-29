package com.example.plantura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.plantura.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}