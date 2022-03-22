package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;

import org.w3c.dom.Node;

import java.util.*;
public class IntegerSet {
	private ArrayList<Integer> setA = new ArrayList<>();
	
	// Default Constructor
	/**
	* @param setA
	* 
	*/
		public IntegerSet(ArrayList setA) {
			this.setA = setA;
			
			
		}


		/**
		 *  Clears the internal representation of the set
		 */
		public void clear() {
			setA.clear();
			
		}
		/**
		 *Returns the length of the set
		 * @return
		 */
		public int length() {
			return setA.size();
		}; 
		
		/**
         * Returns true if the 2 sets are equal, false otherwise;
         * Two sets are equal if they contain all of the same values in ANY order.
         * @param b
         * @return
         */
		
		public boolean equals(IntegerSet b) {
			boolean equal = true;
			for (int num: setA) {
				if(b.contains(num)) {
					equal = true;
				}
				else {
					return false;
				}
			}
			return equal;
		}
		// 
		/** 
		 * Returns true if the set contains the value, otherwise false
		 * @param value
		 * @return
		 */
		public boolean contains(int value) {
			if(setA.contains(value)== true) {
				return true;
			}
			else {
				return false;
			}
		}
		
		//
		/**
		 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
		 * @return
		 * @throws IntegerSetException
		 */
		public int largest() throws IntegerSetException {
			if (setA.size()== 0) {
				IntegerSetException e = new IntegerSetException();
				throw e;
			}
			int large = 0;
			for(int n: setA) {
				if(n > large) {
					large = n;
				}
			}
			return large;
		}
		//
		/**
		 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
		 * @return 
		 * @throws IntegerSetException
		 */
		public int smallest() throws IntegerSetException {
			if (setA.size()==0) {
				IntegerSetException e = new IntegerSetException();
				throw e;
			}
			int small = setA.get(0);
			for (int n: setA) {
				if(n < small) {
					small = n;
				}
			}
			return small;
		}
		
		//
		/**
		 * Adds an item to the set or does nothing it already there
		 * @param item
		 */
		public void add(int item) {
			if (setA.contains(item) != true) {
				setA.add(item);
			}
		}
		
		//
		/**
		 * Removes an item from the set or does nothing if not there
		 * @param item
		 */
		public void remove(int item) {
			if (setA.contains(item) == true) {
				setA.remove(item);
			}
		}
		
		// 
		/**
		 * Set Union
		 * @param intSetb
		 * @return
		 */
		public IntegerSet union(IntegerSet intSetb) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			Set <Integer> set = new HashSet<>();
			set.addAll(setA);
			set.addAll(temp);
			
			ArrayList<Integer> set3 = new ArrayList<>(set);
			IntegerSet set4 = new IntegerSet(set3);
			return set4;
		}
		
		/**
		 * set Intersection
		 * @param intSetb
		 * @return
		 */
		public IntegerSet Intersect(IntegerSet intSetb) {
			ArrayList<Integer> temp = intSetb.getlist();
			setA.retainAll(temp);
			IntegerSet finalSet = new IntegerSet(setA);
			return finalSet;
		}
		
		/** set difference
		 * @param intSetb
		 * @return
		 */
		public IntegerSet difference(IntegerSet intSetb) {
			ArrayList<Integer> temp = intSetb.getlist();
			setA.retainAll(temp);
			IntegerSet finalSet = new IntegerSet(setA);
			return finalSet;
		}
		
		/**
		 * Returns true if the set is empty, false otherwise
		 * @return
		 */
		public boolean isEmpty() {
			if (setA.isEmpty() == true) {
				return true;
			}
			return false;
		}


		public ArrayList<Integer> getlist() {
			// TODO Auto-generated method stub
			return setA;
		}
		
		
		
}
