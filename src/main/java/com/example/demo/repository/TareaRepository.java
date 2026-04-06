package com.example.demo.repository;

import com.example.demo.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tareas", path = "tareas")
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
