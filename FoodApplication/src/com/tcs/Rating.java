package com.tcs;

public class Rating {
	private int rating;
	MenuItem item;
	public Rating() {
		super();
	}
	public Rating(int rating, MenuItem item) {
		super();
		this.rating = rating;
		this.item = item;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public MenuItem getItem() {
		return item;
	}
	public void setItem(MenuItem item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "[rating=" + rating + ", item=" + item + "]";
	}
	
	

	
	
	

}
