package model;

import annotation.*;

public class Book {

	@MyTextField(label = "Author")
	private String author;

	@MyTextField
	private String title;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
