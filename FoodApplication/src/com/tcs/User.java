package com.tcs;
import java.util.*;
public class User {
	private String name;
	private Cart cart;
    private List<Rating> ratings;
	public User() {
		super();
	}
	public User(String name, Cart cart, List<Rating> ratings) {
		super();
		this.name = name;
		this.cart = cart;
		this.ratings = ratings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public void addRating(Rating rating)
	{
		ratings.add(rating);
	}
	
	
	
    
	

}
