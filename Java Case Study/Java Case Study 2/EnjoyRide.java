package com.CaseStudy;

import java.util.Scanner;

public class EnjoyRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adults adults=new Adults();
		Children children=new Children();
		Scanner sc=new Scanner(System.in);
		int adult,child,hours;
		String ride;
		System.out.println("Rides Available:");
		System.out.println(" Alibaba \n Alpine Slide \n Bumpper Cars \n Balloon Race\n");
		System.out.println("Which ride? ");
		ride=sc.nextLine();
		System.out.println("How many adults? ");
		adult=sc.nextInt();
		System.out.println("How many children? ");
		child=sc.nextInt();
		System.out.println("How many hours you want to ride? ");
		hours=sc.nextInt();
		
		System.out.println("Adults ride fair: ");
		int adultPrice= adults.adultsCalc(adult, ride, hours);
		System.out.println(adultPrice);
		
		System.out.println("Children ride fair: ");
		int childPrice= children.childCalc(child, ride, hours);
		System.out.println(childPrice);
		
		System.out.println("Total hours of ride: "+((adult*hours)+(child*hours)));
		
		System.out.println("Total Amount: ");
		Calc(adultPrice,childPrice);
	}

	private static void Calc(int adultPrice, int childPrice) {
		// TODO Auto-generated method stub
		int totalPrice=0;
		totalPrice=adultPrice+childPrice;
		System.out.println(totalPrice);
	}



		
		
		
	

}
