/** 
 * @Author Lena Viazmitinov          12/15/2020                         
 * Shopper.java - Driver code
 * Creates a LinkedList and a HashMap to handle store inventory. 
 * Sorting algorithms sort the elements of Catalog and display in order of user preference 
 * Creates user menu to add and remove items from cart 
 * 
 */
package com.wsu.cs;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import java.util.List;

public class Shopper {

	static LinkedList<Flowers> items = new LinkedList<Flowers>();
	static Map<String, Integer> Catalog = new HashMap<String, Integer>();
	
	public static void sortbykey() {
		//sorts Alphabetically
		TreeMap<String, Integer> sorted = new TreeMap<>();
		sorted.putAll(Catalog);
		
		for(HashMap.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println("Flower: " +entry.getKey() +" price: $"+entry.getValue());
	}
	
	public static void sortLow() {
		//low to high
		List<Map.Entry<String, Integer>> list =
		new LinkedList<Map.Entry<String, Integer>>(Catalog.entrySet());
				
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>> () {
		public int compare(Map.Entry<String, Integer> a1,
		                   Map.Entry<String, Integer> a2)
                   {
	                     return (a1.getValue().compareTo(a2.getValue()));
                   }
			
		});
		
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> a : list) {
			temp.put(a.getKey(), a.getValue());
		} 
		for(HashMap.Entry<String, Integer> entry : temp.entrySet())
			System.out.println("Flower: " + entry.getKey() +" Price: $"+entry.getValue());
	}
	
	 public static void sortHigh() {
			//High to low
			List<Map.Entry<String, Integer>> list =
			new LinkedList<Map.Entry<String, Integer>>(Catalog.entrySet());
					
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>> () {
			public int compare(Map.Entry<String, Integer> a1,
			                   Map.Entry<String, Integer> a2)
	                   {
		                     return (a2.getValue().compareTo(a1.getValue()));
	                   }
				
			});
			
			HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
			for(Map.Entry<String, Integer> a : list) {
				temp.put(a.getKey(), a.getValue());
			} 
			for(HashMap.Entry<String, Integer> entry : temp.entrySet())
				System.out.println("Flower: " + entry.getKey() +" Price: $"+entry.getValue());
		}


	public static void main(String[] args) {
		
	Flowers f1 = new Flowers("Daisy", 4);
    Flowers f2 = new Flowers("Rose", 3);
    Flowers f3 = new Flowers("Sunflower", 4);
	Flowers f4 = new Flowers("Lilly", 5);
	Flowers f5 = new Flowers("Lilac", 6);
	
	items.add(f1);
	items.add(f2);
	items.add(f3);
	items.add(f4);
	items.add(f5);
	
	Catalog.put(f1.getFlowerName(), f1.getPrice());
	Catalog.put(f2.getFlowerName(), f2.getPrice());
	Catalog.put(f3.getFlowerName(), f3.getPrice());
	Catalog.put(f4.getFlowerName(), f4.getPrice());
	Catalog.put(f5.getFlowerName(), f5.getPrice());

	
	ShoppingCart myCart = new ShoppingCart();
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Hello to my flower shop!");
	System.out.println("Would you like to see our selection in order of:");
	System.out.println("Highest to Lowest: Enter 1");
	System.out.println("Lowest to Highest: Enter 2");
	System.out.println("Alphabetically: Enter 3");
	
	String sort = in.next();
	if(sort.equals("1")) {
		sortHigh();
	}
	if(sort.equals("2")) {
		sortLow();
	}
	if(sort.equals("3")) {
		sortbykey();
	}
	
	boolean done = false;
    while (!done)
    {	
			System.out.println("What would you like to do? ");
			System.out.println("To add to cart Enter: A");
			System.out.println("To remove an item from your cart Enter: R");
			System.out.println("To checkout Enter: C");
			System.out.println("Cart: "+ myCart.getSize());
			
			
			String next = in.next();
			
			if(next.equals("A") || next.equals("a")) {
			System.out.print("Type the Flower you want to add to cart: ");
			
			String a = in.next();
			System.out.println("Enter quantity:() ");
			int j = in.nextInt();
			
			
			for(Flowers f : items) {
				if(f.getFlowerName().equals(a)) {
					for(int i = 0; i < j; i++) {
					myCart.addItemCart(f);
					}
					myCart.printCart();
					System.out.println("Your total: $" + myCart.computeTotal());
				  }  	
			   }
			}
			
			else if(next.equals("R")|| next.equals("r")) {
				
			System.out.println("Would you like to remove an item from your Cart? Y/N");
			String remove = in.next();
				if(remove.equals("Y") || remove.equals("y")) {
				
					System.out.println("Okay, here is your cart so far");
					myCart.printCart();
					System.out.println(myCart.computeTotal());
					System.out.println("Enter the item you wish to remove: ");
			        String r = in.next();
			        System.out.print("Enter the ammount you wish to remove: ");
			        int j = in.nextInt();
			        
			        for(Flowers f : items) {
			        	if(f.getFlowerName().equals(r)) {
			        		for(int i = 0; i < j; i++) {
			        		myCart.removeItemCart(f);
			        		}
			        		
			        	    myCart.printCart();
			        	    System.out.println("(x" + j + ") " + f.getFlowerName() + " has been removed");
			        	    System.out.println("Your total: $" + myCart.computeTotal());
			        	  
			        	}
						
					}
				}
				
			}
			
			else if(next.equals("C") || next.equals("c")) {
				myCart.printCart();
				System.out.println("Your total: $" + myCart.computeTotal());
				System.out.println("Enter the dollar ammount you are paying: ");
				int ammount = in.nextInt();
				myCart.transaction(ammount);
				System.out.print("Thanks for shopping with us! Have a good day!");
				done = next.equals("C");
				
			}
      	}		
     }
}
