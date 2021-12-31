package com.greatlearning.service;

public class BinarySearchImplementation {

	public void binarySearchImplementation (double price[], int low, int high, double key)
	{
	
		
		int mid = (low+high)/2;
		
		while (low <= high) {
			if (price[mid] < key)
				low = mid+1;
			else if (price[mid] == key)	{
				
				System.out.println ("Stock of value  " + key + " is present"); 
				break;
			}
				else 
					high = mid-1;
			mid = (low+high) /2;
			}
		
		
		if (low>high) System.out.println ("Stock not found");
		
		}
	}
