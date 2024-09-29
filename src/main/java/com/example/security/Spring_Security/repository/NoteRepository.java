package com.example.security.Spring_Security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.Spring_Security.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{
    List<Note> findByOwnerUsername(String ownerUsername);
}
