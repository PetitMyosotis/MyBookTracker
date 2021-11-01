package com.mybooktracker.book;

import com.mybooktracker.author.AuthorDTO;
import com.mybooktracker.reading.ReadingDTO;
import com.mybooktracker.type.TypeDTO;

public class BookDTO {
	private AuthorDTO author;
	private String title;
	private int numberOfPages;
	private ReadingDTO reading;
	private TypeDTO type;
	
	public AuthorDTO getAuthor() {
		return author;
	}
	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public ReadingDTO getReading() {
		return reading;
	}
	public void setReading(ReadingDTO reading) {
		this.reading = reading;
	}
	public TypeDTO getType() {
		return type;
	}
	public void setType(TypeDTO type) {
		this.type = type;
	}
	
	

}
