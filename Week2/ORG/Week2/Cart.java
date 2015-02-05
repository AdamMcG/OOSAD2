package ORG.Week2;

import java.util.*;

public class Cart {

	public Cart() {
		for(int i = 0; i < 100; i++)
		{
		CartItem c = new CartItem();
		c.setID(i);
		CartItems.add(c);
		}
	}
	
	public void printItems(CartItems c){
		for(CartItem cItem: CartItems){
		System.out.println(" Name " + c.getName() + " id " + c.getID() + "price: " + c.getPrice());
		}	
	}
	protected Collection<CartItem> CartItems;
	
	
}
