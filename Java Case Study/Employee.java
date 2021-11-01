package com.CaseStudy;

import java.util.Scanner;

//EMPLOYEENAME, BASICSALARY, SPECIALALLOWANCE(SA), HRA, TRANSPORTALLOWANCE, 
//TAX DEFAULT VALUE IS RS. 2500.
//NETSALARY= BASICSALARY+HRA+SPECIALAALLOWANCE+TRANSPORTALLOWANCE-TAX.
//
//Basic Salary <= 10000 : HRA = 20%, SA = 80%
//Basic Salary is between 10001 to 20000 : HRA = 25%, SA = 90%
//Basic Salary >= 20001 : HRA = 30%, SA = 95%

public class Employee {
	int employeeId;
	String employeeName;
	double basicSalary;
	double specialAllowance;
	double HRA;
	double transportAllowance;
	int tax=2500;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void calcNetSalary(double basicSalary,double transportAllowance){
		double netSalary;
		if(basicSalary<= 10000 )
		{
			HRA=0.2f;
			specialAllowance=0.8f;
			netSalary=basicSalary+HRA+specialAllowance+transportAllowance-tax;
			System.out.println(netSalary);
		}
		else if(basicSalary>= 10001 && basicSalary<=20000 )
		{
			HRA=0.25f;
			specialAllowance=0.9f;
			netSalary=basicSalary+HRA+specialAllowance+transportAllowance-tax;
			System.out.println(netSalary);
		}
		else
		{
			HRA=0.3f;
			specialAllowance=0.95f;
			netSalary=basicSalary+HRA+specialAllowance+transportAllowance-tax;
			System.out.println(netSalary);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Employee name: ");
//		e.employeeName=sc.nextLine();
//		System.out.println("Enter Employee id: ");
//		e.employeeId=sc.nextInt();
		e.setEmployeeId(101);
		e.setEmployeeName("Rabiya");
		
		System.out.println("Enter Employee basic salary: ");
		e.basicSalary=sc.nextDouble();
		System.out.println("Employee id: "+e.getEmployeeId());
		System.out.println("Employee Name: "+e.getEmployeeName());
		System.out.println("Employee net salary: ");
		e.calcNetSalary(e.basicSalary,0.2);
	}
	

}
