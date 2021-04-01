package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends CrudRepository<Client, Long>{
	
	@Query("select c from Client c where c.username = :username and c.mdp = :mdp ")
    Optional<Client> findByUsernameAndMdp(@Param("username") String username,@Param("mdp") String password);
}

