package com.bookStore.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.entity.Book;



public interface BookRepository extends JpaRepository<Book, Long>{
	 
	 Book getById(Long id);

}
