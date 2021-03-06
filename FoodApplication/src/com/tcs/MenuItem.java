package com.tcs;

public class MenuItem {
	private int itemId;
	private String name;
	private int cost;
	public MenuItem() {
		super();
	}
	public MenuItem(int itemId, String name, int cost) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.cost = cost;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "[itemId=" + itemId + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
	
	
	
	
	
	

}
