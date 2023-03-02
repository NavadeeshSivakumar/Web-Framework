package com.navadeesh.day5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
    @Column(name="ID")
    private int id;

    @Column(name="BOOK")
    private String bookName;

    @Column(name="PRICE")
    private float price;

    @Column(name="QUANTITY")
    private int quantity;

    @Column(name="AUTHOR")
    private String authorName;
    public Book() {};
    public Book(int id,String bookName,float price,int quantity,String authorName)
    {
    	super();
    	this.id=id;
    	this.bookName=bookName;
    	this.price=price;
    	this.quantity=quantity;
    	this.authorName=authorName;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
