package com.techprimers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
