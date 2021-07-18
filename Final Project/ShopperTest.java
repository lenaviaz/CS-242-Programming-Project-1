/** 
 * ShopperTest.java
 * creates tests and ensures correctness of methods created in ShoppingCart.java that are used in driver code
 *
 */

package com.wsu.cs;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShopperTest {
	
	private static Flowers a1, a2, a3;
	
	 @BeforeAll
	    public static void setUp() {
	        a1 = new Flowers("a", 1);
	        a2 = new Flowers("b", 2);
	        a3 = new Flowers("c", 3);
	    }

    @Test
	void test_getPrice() {
		int check = a1.getPrice();
		assertEquals(1, check);
	}
	@Test
	void test_compute() {
		/* testing compute total method
		 */
		ShoppingCart testCart = new ShoppingCart();
		
		testCart.addItemCart(a1);
        testCart.addItemCart(a2);
        int output = testCart.computeTotal();
        
        assertEquals(3, output);
	}
	
	@Test
	void test_notNull() {
		/*test removing elements
		 */
        ShoppingCart testCart = new ShoppingCart();
		
		testCart.addItemCart(a1);
        testCart.addItemCart(a2);
        testCart.removeItemCart(a1);
        
        assertNotNull(testCart);
        
	}
	
	
	@Test
	void test_cartSize() {
		/*test cart size 
		 */
		
		  ShoppingCart testCart = new ShoppingCart();
		  
		  testCart.addItemCart(a1);
	      testCart.addItemCart(a2);
	      testCart.addItemCart(a3);
		
	      int length = testCart.getSize();
	      
	      assertEquals(3, length);
	      
	}
	
	@Test
	void test_transaction() {
		  ShoppingCart testCart = new ShoppingCart();
		  
		  testCart.addItemCart(a1);
	      testCart.addItemCart(a2);
	      testCart.addItemCart(a3);
		  int payment = 10;
		  
		 int a = testCart.transaction(10);
		  
		  int desiredChange = 4;

		  assertEquals(4, a);
	
		
	}

}
