/**
 * ShoppingCart.java
 * Creates a LinkedList cart, has methods to add and remove items from cart, handle transactions
 * display cart and amount
 */
package com.wsu.cs;
import java.util.LinkedList;

public class ShoppingCart {
	
	LinkedList <Flowers> Cart = new LinkedList<Flowers>();

	public void addItemCart(Flowers f) {
		Cart.add(f);
	}
	
	public void removeItemCart(Flowers f) {
		Cart.remove(f);
	}
	
	public int computeTotal() {
		int count = 0;
		for (Flowers a : Cart) {
			count += a.getPrice();
		}
		return count;
	}
	
	public void printCart() {
		for (Flowers a : Cart) {
			System.out.println(a.NameandPrice());
		}
	}
	
	public int transaction(int payment) {
		int change = 0;
		
		if(payment > computeTotal()) {
			change += payment - computeTotal();
			System.out.println("Your change is: $" + change);
		}
		else if (payment == computeTotal()) {
			change = 0;
		}
		else if (payment < computeTotal()) {
			System.out.println("I'm sorry, you don't have enough to pay: ");
		}
		
		return change;
    	}

	     public int getSize() {
		    return Cart.size();
	     }
}






