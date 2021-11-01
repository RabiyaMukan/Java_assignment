package com.CaseStudy;

public class Children {
	public int childCalc(int adult,String ride,int hours){
	int childPrice=0;
	switch(ride)
	{
	
	case "Alibaba": childPrice=hours*40*adult;
					break;
	case "Alpine Slide": childPrice=hours*30*adult;
						 break;
	
	case "Bumpper Cars": childPrice=hours*25*adult;
						 break;
	
	case "Balloon Race": childPrice=hours*60*adult;
						 break;
						
	default: System.out.println("Ride not found");

	}
	return childPrice;
	}
}
