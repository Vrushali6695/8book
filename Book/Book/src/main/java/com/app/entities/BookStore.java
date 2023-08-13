package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "bookstore")
public class BookStore extends BaseEntity {
	@Column(name = "book_name", length=20)
	private String title;
	private double price;
	@Column(length=20)
	private String author;
	
	
	
	public BookStore() {
		
	}
	public BookStore(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookStore [ Id=" + getId() + "title=" + title + ", price=" + price + ", author=" + author +  "]";
	}
	
	

	

}
