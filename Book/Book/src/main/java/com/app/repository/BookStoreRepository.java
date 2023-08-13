package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.BookStore;


public interface BookStoreRepository extends JpaRepository<BookStore, Long> {

}
