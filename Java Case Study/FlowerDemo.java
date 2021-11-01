package com.CaseStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerDemo {

	public static void displayFlower(String continent)
	{
		switch(continent)
		{
		case "Asia":ArrayList<String> country1=new ArrayList<>();
					ArrayList<String> flower1=new ArrayList<>();
					country1.add("India");
					country1.add("Pakistan");
					country1.add("Nepal");
					flower1.add("Lotus");
					flower1.add("Jasmine");
					flower1.add("Lali Gurans");
					System.out.println("_______________________");
					System.out.println("Country: ");
					for(int i=0;i<country1.size();i++)
					{
						System.out.println(country1.get(i));
					}
					System.out.println("_______________________");
					System.out.println("Flower: ");
					for(int i=0;i<flower1.size();i++)
					{
						System.out.println(flower1.get(i));
					}
					System.out.println("_______________________");
					break;

					
		case "Europe":  ArrayList<String> country2=new ArrayList<>();
						ArrayList<String> flower2=new ArrayList<>();
						country2.add("Germany");
						country2.add("France");
						country2.add("Greece");
						flower2.add("Corn Flower");
						flower2.add("Lily");
						flower2.add("Acanthus Mollis");
						System.out.println("_______________________");
						System.out.println("Country: ");
						for(int i=0;i<country2.size();i++)
						{
							System.out.println(country2.get(i));
						}
						System.out.println("_______________________");
						System.out.println("Flower: ");
						for(int i=0;i<flower2.size();i++)
						{
							System.out.println(flower2.get(i));
						}
						System.out.println("_______________________");
						break;
						
		case "Africa": ArrayList<String> country3=new ArrayList<>();
					   ArrayList<String> flower3=new ArrayList<>();
					   country3.add("Egypt");
					   country3.add("Nigeria");
					   country3.add("Kenya");
					   flower3.add("Blue Lotus");
					   flower3.add("Yellow Trumpet");
					   flower3.add("Orchid");
				   	   System.out.println("_______________________");
					   System.out.println("Country: ");
					   for(int i=0;i<country3.size();i++)
					   {
						   System.out.println(country3.get(i));
					   }
					   System.out.println("_______________________");
					   System.out.println("Flower: ");
					   for(int i=0;i<flower3.size();i++)
					   {
						   System.out.println(flower3.get(i));
					   }
					   System.out.println("_______________________");
					   break;
					
		default: System.out.println("Country not found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cont;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Continent name: ");
		cont=sc.nextLine();
		displayFlower(cont);
	}

}
