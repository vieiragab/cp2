package br.com.fiap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}