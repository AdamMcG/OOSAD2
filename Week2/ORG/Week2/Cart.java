package ORG.Week2;

import java.util.*;

public class Cart {

	public Cart() {
		for(int i = 0; i < 100; i++)
		{
		CartItems.add(new CartItem(1, 100, "Poo"));
		}
	}
	protected Collection<CartItem> CartItems;
	
	
}
