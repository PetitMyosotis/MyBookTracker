package com.mybooktracker.reading;

import java.util.Date;

public class ReadingDTO {
	private int numberOfPages;
	private Date date;
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
