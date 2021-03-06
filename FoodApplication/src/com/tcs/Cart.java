package com.tcs;

import java.util.List;

public class Cart {
	private int cartId;
	private List<MenuItem> items;
	public Cart() {
		super();
	}
	public Cart(int cartId, List<MenuItem> items) {
		super();
		this.cartId = cartId;
		this.items = items;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<MenuItem> getItems() {
		return items;
	}
	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "cartId=" + cartId + ", items=" + items + "";
	}
	public void addItem(MenuItem item)
	{
		items.add(item);
	}
	public int getTotal()
	{
		int total=0;
		for(MenuItem item:items)
			total+=item.getCost();
		return total;
	}
}
