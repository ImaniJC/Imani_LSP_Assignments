package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	@Test
	@DisplayName("IntegerSet.Clear test cases")
	public void testClear() {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		set1.clear();
		set2.clear();
		assertEquals(set1.length(),0);
		assertEquals(set2.length(),0);
		
	}
	
	@Test 
	@DisplayName("IntegerSet.Length test cases")
	public void testLength() throws Exception {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		int size1 = set1.length();
		int size2 = set2.length();
		assertEquals(set1.length(), size1);
		assertEquals(set2.length(), size2);
		
	}
	
	/*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */
	@Test
	@DisplayName("IntegerSet.isEqual test cases")
	public void testIsEqual() {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		assertEquals(set1, set2);
		
		set2.remove(3);
		assertNotEquals(set1, set2);		
		
	}

	@Test 
	@DisplayName("IntegerSet.contains test cases")
	public void testContains() {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		assertTrue(set1.contains(3));
		assertTrue(set2.contains(1));
		
		assertFalse(set1.contains(5));
		assertFalse(set2.contains(7));
			
	}
	
	@Test
	@DisplayName("IntegerSet.Largest test cases")
	public void testLargest() throws Exception  {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(1);
		set1.add(5);
		set1.add(15);
		set1.add(9);
		
		
		set2.add(2);
		set2.add(8);
		set2.add(7);
		set2.add(14);
		int expectedValue = 0;
	       try {
	           expectedValue = set1.largest();
	       } catch (IntegerSetException e) {
	           e.printStackTrace();
	       }
	       assertEquals(15, expectedValue);
	    int expectedValue2 = 0;
	       try {
	           expectedValue2 = set2.largest();
	       } catch (IntegerSetException e) {
	           e.printStackTrace();
	       }
	       assertEquals(14, expectedValue2);
	       	       
	   }
	@Test
	@DisplayName("IntegerSet.Smallest test cases")
	public void testSmallest() throws Exception  {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(1);
		set1.add(5);
		set1.add(15);
		set1.add(9);
		
		
		set2.add(2);
		set2.add(8);
		set2.add(7);
		set2.add(14);
		int expectedValue = 0;
	       try {
	           expectedValue = set1.smallest();
	       } catch (IntegerSetException e) {
	           e.printStackTrace();
	       }
	       assertEquals(1, expectedValue);
	    int expectedValue2 = 0;
	       try {
	           expectedValue2 = set2.smallest();
	       } catch (IntegerSetException e) {
	           e.printStackTrace();
	       }
	       assertEquals(2, expectedValue2);
	       	       
	   }
		
	
	
	
	
	@Test 
	@DisplayName("IntegerSet.addItem test cases")
	public void testAddItem() {
		
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		String expectedset1 = "1,2,3,4";
		String expectedset2 = "1,2,3,4";
		
		assertEquals(expectedset1, set1.toString());
		assertEquals(expectedset2, set2.toString());
		
//		System.out.println(set1.toString());
//		assertEquals("[1,2,3,4]", set1.toString());
//		System.out.println(set2.toString());
//		assertEquals("[1,2,3,4]", set2.toString());
//		
//		set1.add(9);
//		set2.add(20);
//		
//		assertEquals("[1,2,3,4,9]", set1.toString());
//		assertEquals("[1,2,3,4,20]", set2.toString());	
		
		
	}
	

	@Test 
	@DisplayName("IntegerSet.RemoveItem test cases")
	public void testRemoveItem() {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
//		System.out.println(set1.toString());
//		assertEquals("[1,2,3,4]", set1.toString());
//		System.out.println(set2.toString());
//		assertEquals("[1,2,3,4]", set2.toString());
//		
		set1.remove(4);
		set2.remove(3);
		
		String expectedset1 = "1 2 3";
		String expectedset2 = "1 2";
		
		assertEquals(expectedset1, set1.toString());
		assertEquals(expectedset2, set2.toString());
		

//		assertEquals("[1,2,3]", set1.toString());
//		assertEquals("[1,2]", set2.toString());	
		
		
	}
	
	@Test
	@DisplayName("IntegerSet.isEmpty test cases")
	public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet(null);
		assertTrue(set1.isEmpty());
		
		set1.add(1);
		assertFalse(set1.isEmpty());
	}
	
	@Test
	@DisplayName("IntegerSet.union test cases")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet(null);
		set1.add(1);
		set1.add(2);
		
		IntegerSet set2 = new IntegerSet(null);
		set2.add(3);
		
		set1.union(set2);
		
		System.out.println(set1.toString());
		assertEquals("[1,2,3]", set1.toString());
		assertNotEquals("[3,2,1]", set1.toString());
				
	}
	
	@Test
	@DisplayName("IntegerSet.union throws exception")
	public void testUnion_Throws_Exception() {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		Exception exception = assertThrows(RuntimeException.class, () -> {  
				
		});
		
		String exceptedMessage = "Empty set in Union";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(exceptedMessage));

	}
	
	@Test 
	@DisplayName("IntegerSet.Diff test cases")
	public void testDiff() {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		set1.difference(set2);
		System.out.println(set1.toString());
		assertEquals("[4]", set1.toString());
	
		
	}
	@Test 
	@DisplayName("IntegerSet.stringRepresentation test cases")
	public void testStringRep() {
		IntegerSet set1 = new IntegerSet(null);
		IntegerSet set2 = new IntegerSet(null);
		
		set1.add(2);
		set1.add(3);
		
		set2.add(4);
		set2.add(5);
		
		String expectedValue1 = "2,3 ";
	    assertEquals(expectedValue1, set1.toString());
	    
	    String expectedValue2 = "4,5 ";
	    assertEquals(expectedValue2, set1.toString());
	}

}
