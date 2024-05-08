package com.tutorial.springsecurityclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.springsecurityclient.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
