package com.navadeesh.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navadeesh.day5.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
