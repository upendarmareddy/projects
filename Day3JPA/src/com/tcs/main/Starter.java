package com.tcs.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tcs.model.Cart;
import com.tcs.model.FoodItem;

public class Starter {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Day3JPA");
		EntityManager em = emf.createEntityManager();
//		FoodItem item = new FoodItem();
//		item.setItemId(110);
//		item.setName("fried rice");
//		item.setCategory("non-veg");
//		item.setPrice(100.00);
//		item.setActive(1);
//		item.setAddedOn(new Date(121,10,12));
//		em.getTransaction().begin();
//		em.persist(item);
//		em.getTransaction().commit();
//		em.getTransaction().begin();
//		List<FoodItem> items = em.createNamedQuery("FoodItem.findAll").getResultList();
//		for (FoodItem item1 : items) {
//			System.out.println(item1.getItemId()+"\t\t"+item1.getName()+"\t\t"+item1.getCategory()+"\t\t"+item1.getPrice()+"\t\t"+item1.getAddedOn()+"\t\t"+item1.getActive());
//			
//		}
//		em.getTransaction().commit();
//		em.getTransaction().begin();
//		FoodItem item2 = em.find(FoodItem.class, 110);
//		item2.setActive(0);
//		em.getTransaction().commit();
	
//	    em.getTransaction().begin();
//		List<FoodItem> items1= em.createNamedQuery("FoodItem.findAll").getResultList();
//		for (FoodItem item3 : items1) {
//			System.out.println(item3.getItemId()+"\t\t"+item3.getName()+"\t\t"+item3.getCategory()+"\t\t"+item3.getPrice()+"\t\t"+item3.getAddedOn()+"\t\t"+item3.getActive());
//			
//		}
//		em.getTransaction().commit();
//		em.getTransaction().begin();
//		FoodItem item4=em.find(FoodItem.class, 110);
//		em.remove(item4);
//		em.getTransaction().commit();
		
		
		
	}

}
