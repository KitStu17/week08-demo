package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
    // List<TodoEntity> findByUserId(String userId);

    // namedQuery and Query
    @Query("select t from TodoEntity t where t.userId = ?1")
    List<TodoEntity> searchByUserId(String userId);
}
