package org.cap.main;

import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void display(List<Integer> lst)
	{
		long count= lst.stream().count();
		System.out.println("No of elements:" + count);
	}

	public static void main(String[] args) {
		display(Arrays.asList(22,12,56,78,98));		
		// TODO Auto-generated method stub

	}

}
