package com.stackroute.repository;

import com.stackroute.domain.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);
	
}