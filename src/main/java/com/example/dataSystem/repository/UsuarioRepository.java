package com.example.dataSystem.repository;

import com.example.dataSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<User, Integer> {
    Optional<User> findOneByUsername(String username);
}
