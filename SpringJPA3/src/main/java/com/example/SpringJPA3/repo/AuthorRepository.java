package com.example.SpringJPA3.repo;

import com.example.SpringJPA3.entities.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
