package com.greatlearning.main;
import com.greatlearning.service.*;
	import java.util. Scanner;
	import com.greatlearning.service.*;  //importing Service Package

public class Driver {

	public static void main (String[] args) {
		
		System.out.println("Enter the number of Companies");
		
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		
		double[] price= new double [size];
		boolean[] change= new boolean [size];
		
		for (int i=0; i<size; i++) {
			
			System.out.println("Enter the current Stock price of Company " + (i+1));
			
			price [i] = (double) sc.nextDouble();
			
			System.out.println("Whether company's stock price rose today compared to yesterday");
			
			change [i] = sc.nextBoolean();
						
		}
		
		int choice;
		do
		{
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1.) Display the companies stock prices in ascending order");
		System.out.println("2.) Display the companies stock prices in descending order");
		System.out.println("3.) Display the total no. of companies for which the stock price rose today");
		System.out.println("4.) Display the total no. of companies for which the stock price declined today");
		System.out.println("5.) Search a specific stock price");
		System.out.println("6.) Press 0 to exit");
		
		choice = sc.nextInt();
		
		
		switch(choice) {
			
			case 1: {
				System.out.println("Companies stock prices in ascending order are : ");
				MergeSortImplementationAscending mergeSortImplementation = new MergeSortImplementationAscending();
				mergeSortImplementation.sort(price,0,price.length-1);
				for (int i=0; i<size; i++)
				System.out.print (price[i] + " ");
				break;
				
			}
			case 2: {
				System.out.println("Companies stock prices in descending order are : ");
				MergeSortImplementationDescending mergeSortImplementationD = new MergeSortImplementationDescending();
				mergeSortImplementationD.sort(price,0,price.length-1);
				for (int i=0; i<size; i++)
				System.out.print (price[i] + " ");
				break;
				
			}
			case 3: {
				int flag = 0;
				for (int i=0; i<size;i++) {
					if (change[i] == true)
						flag = flag +1;
				}
				System.out.println("Total no. of Companies for which stock price rose today are : " + flag);
				break;
				
			}
			case 4: {
				int flag2 = 0;
				for (int i=0; i<size;i++) {
					if (change[i] == false) flag2 = flag2 +1;
				}
				System.out.println("Total no. of Companies for which stock price declined today are : " + flag2);
				break;
				
			}
			case 5: {
				System.out.println("Enter the key value ");
				double key =sc.nextDouble();
				MergeSortImplementationAscending mergeSortImplementation = new MergeSortImplementationAscending();
				mergeSortImplementation.sort(price,0,price.length-1);
				
				BinarySearchImplementation binarySearch = new BinarySearchImplementation();
				binarySearch.binarySearchImplementation (price,0,size,key);	
			
				break;
				
			}
			case 0: System.out.println("Exited Successfully"); break;
				
			default: System.out.println("Value Not found");
			
		}
		}
		while (choice !=0);
	}
}