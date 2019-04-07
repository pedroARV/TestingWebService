package com.example.jwtTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jwtTest.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}
