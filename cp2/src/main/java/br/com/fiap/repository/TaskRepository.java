package br.com.fiap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Optional<Task> findByUsername(String status);
}