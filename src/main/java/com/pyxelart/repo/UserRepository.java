package com.pyxelart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyxelart.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
