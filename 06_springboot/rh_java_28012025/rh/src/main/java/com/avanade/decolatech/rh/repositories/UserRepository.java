package com.avanade.decolatech.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.avanade.decolatech.rh.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer>{
	@Query("SELECT u FROM Usuario u WHERE u.username = :username")
	public Usuario getUserByUsername(@Param("username") String username);

}
