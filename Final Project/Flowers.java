/**
 * Flowers.java
 * Template for creating instances of flower objects, includes get and set methods
 */
package com.wsu.cs;
public class Flowers {
	
	private String flowerName;
	private int price;
	
	public Flowers(String flowerName, int price) {
		this.flowerName = flowerName;
		this.price = price;
	}
	
	public void setFlowerName(String name) {
		flowerName = name;
	}
	public String getFlowerName(){
		return flowerName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return flowerName;
		
	}
	
   public String NameandPrice() {
	   return flowerName + " : $" + price;
   }
		  
	   
   }

