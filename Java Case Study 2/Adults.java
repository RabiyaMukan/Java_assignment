package com.CaseStudy;

public class Adults {
	public int adultsCalc(int adult,String ride,int hours){
	int adultPrice=0;
	switch(ride)
	{
	
	case "Alibaba": adultPrice=hours*50*adult;
					break;
	
	case "Alpine Slide": adultPrice=hours*60*adult;
						 break;
	
	case "Bumpper Cars": adultPrice=hours*45*adult;
						 break;
	
	case "Balloon Race":adultPrice=hours*70*adult;
						 break;
						
	default: System.out.println("Ride not found");

	}
	return adultPrice;
	}
}
