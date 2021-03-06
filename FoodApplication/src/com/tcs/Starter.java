package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MenuItem item1 = (MenuItem) context.getBean("item1");
		System.out.println("Item1 Details:"+item1);
		MenuItem item2 = (MenuItem) context.getBean("item2");
		System.out.println("Item2 Details:"+item2);
		MenuItem item3 = (MenuItem) context.getBean("item3");
		System.out.println("Item3 Details:"+item3);
		MenuItem item4 = (MenuItem) context.getBean("item4");
		System.out.println("Item4 Details:"+item4);
		MenuItem item5 = (MenuItem) context.getBean("item5");
		System.out.println("Item5 Details:"+item5);
		Rating rating1 = (Rating) context.getBean("rating1");
		Rating rating2 = (Rating) context.getBean("rating2");
		Rating rating3 = (Rating) context.getBean("rating3");
		Rating rating4 = (Rating) context.getBean("rating4");
		Rating rating5 = (Rating) context.getBean("rating5");
		Cart cart1 = (Cart) context.getBean("cart1");
		Cart cart2 = (Cart) context.getBean("cart2");
		Cart cart3 = (Cart) context.getBean("cart3");
		Cart cart4 = (Cart) context.getBean("cart4");
		Cart cart5 = (Cart) context.getBean("cart5");
		User user1 = (User) context.getBean("user1");
		user1.getCart().addItem(item1);
		user1.getCart().addItem(item2);
		user1.getCart().addItem(item5);
		rating5.item=item1;
	    user1.getRatings().add(rating5);
		rating4.item=item3;
	    user1.getRatings().add(rating4);
	    System.out.println("name:"+user1.getName()+"\ncart:"+user1.getCart()+"\nratings:"+user1.getRatings()+"\ntotal:"+user1.getCart().getTotal());
		User user2 = (User) context.getBean("user2");
		User user3 = (User) context.getBean("user3");
		User user4 = (User) context.getBean("user4");
		User user5 = (User) context.getBean("user5");
		
		
	}

}
