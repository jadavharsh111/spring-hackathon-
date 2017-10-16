package com.spring.hackathon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository; 
import com.spring.hackathon.domain.User;

interface UserRepository extends CrudRepository<User,Long> {

}


