package Area;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		System.out.println(list);
		double sum=Sum(list);
		System.out.println("Sum: "+sum);
		Mean(list,sum);
		System.out.println("Median: "+Median(list));
	}
	public static double Sum(ArrayList<Integer> list)
	{
		double sum=0;
		for(int i=0;i<list.size();i++) {
			sum=sum+list.get(i);
		}
		return sum;
		
	}
	public static void Mean(ArrayList<Integer> list,double sum) {
		double mean=0;
		mean=sum/list.size();
		System.out.println("Mean: "+mean);
	}
	
	public static double Median(ArrayList<Integer> list) {
		double low=0;
		double high=0;
		Collections.sort(list);
		if(list.size()%2==1)
			return list.get((list.size()+1)/2-1);
		else {
			low=list.get((list.size())/2-1);
			high=list.get((list.size())/2);
			return (low+high)/2.0;
		}
	}
}
