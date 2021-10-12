package com.tcs.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the food_items database table.
 * 
 */
@Entity
@Table(name="food_items")
@NamedQuery(name="FoodItem.findAll", query="SELECT f FROM FoodItem f")
public class FoodItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	private int itemId;

	private int active;

	@Temporal(TemporalType.DATE)
	@Column(name="added_on")
	private Date addedOn;

	private String category;

	private String name;

	private double price;

	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="foodItem")
	private List<Cart> carts;

	//bi-directional many-to-one association to Rating
	@OneToMany(mappedBy="foodItem")
	private List<Rating> ratings;

	public FoodItem() {
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getAddedOn() {
		return this.addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	public List<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public Cart addCart(Cart cart) {
		getCarts().add(cart);
		cart.setFoodItem(this);

		return cart;
	}

	public Cart removeCart(Cart cart) {
		getCarts().remove(cart);
		cart.setFoodItem(null);

		return cart;
	}

	public List<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Rating addRating(Rating rating) {
		getRatings().add(rating);
		rating.setFoodItem(this);

		return rating;
	}

	public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setFoodItem(null);

		return rating;
	}

}