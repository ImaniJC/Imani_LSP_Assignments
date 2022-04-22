package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
//import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;

public class MapUtilitiesTest {
	@Test
	@DisplayName("MapUtilities.equals key/value")
		public void testKeyValue() throws NullMapException{
			HashMap<String, String> map1= new HashMap<>();
			map1.put("Alice", "Healthy");
			map1.put("Mary", "Ecstatic");
			map1.put("Bob", "Happy");
			map1.put("Chuck", "Fine");
			map1.put("Felix", "Sick");
			
			
			HashMap<String, String> map2= new HashMap<>();
			map2.put("Mary", "Ecstatic");
			map2.put("Felix", "Healthy");
			map2.put("Ricardo", "Subperb");
			map2.put("Tom", "Fine");
			map2.put("Bob", "Happy");
			
			//System.out.print(map1);
			//System.out.print(map2);
//			System.out.print(commonKeyValuePairs(map1, map2));
			
			//test if map and key are equal
			MapUtilities hmap = new MapUtilities();
			assertEquals(hmap.commonKeyValuePairs(map1, map2),2);
			
			 				
			
		}
	@Test
	@DisplayName("MapUtilities.is Empty/notSimilar")
		public void testEmpty() throws NullMapException { // wont work without the exception
			HashMap<String, String> map3= new HashMap<>();
			map3.put("Alice", "Healthy");
			map3.put("Mary", "Ecstatic");
			map3.put("Bob", "Happy");
			map3.put("Chuck", "Fine");
			map3.put("Felix", "Sick");
			
			
		
			HashMap<String, String> map4= new HashMap<>();
			map4.put("sandy", "Excited");
			map4.put("Felix", "Healthy");
			map4.put("Ricardo", "Subperb");
			map4.put("Tom", "Fine");
			map4.put("Imani", "Amazing");
			
			MapUtilities hmap2 = new MapUtilities();

			assertEquals(hmap2.commonKeyValuePairs(map3, map4),0);
				
			
		}
	
	@Test
	@DisplayName("MapUtilities.throws NullMapexception")
		public void testThrows() throws NullMapException { // wont work without the exception
			HashMap<String, String> map5= new HashMap<>();
			
			
			HashMap<String, String> map6= new HashMap<>();
			
			MapUtilities Map = new MapUtilities();
			
			Exception exception = assertThrows(NullMapException.class, () -> {
				Map.commonKeyValuePairs(null, map6);
			});
			
			

		
				
			
		}
	
	
	



//		private Object commonKeyValuePairs(Map<String, String> map1, Map<String, String> map2) {
//			// TODO Auto-generated method stub
//			return null;
//		}
	
	
	
	
	
	
	}
