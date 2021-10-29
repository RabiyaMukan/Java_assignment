package com.Association;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UndergradStudent ug=new UndergradStudent();
		ug.setName("Robin");
		System.out.println("Student Name: "+ug.getName());
		ug.setRollno(11);
		System.out.println("Student Roll number: "+ug.getRollno());
		ug.setCity("Bamgalore");
		System.out.println("Student City: "+ug.getCity());
		ug.StudentBranch();
		ug.StudentSociety();
		System.out.println();
		UndergradStudent ug1=new UndergradStudent();
		ug1.setName("Bob");
		System.out.println("Student Name: "+ug1.getName());
		ug1.setRollno(21);
		System.out.println("Student Roll number: "+ug1.getRollno());
		ug1.setCity("Mysore");
		System.out.println("Student City: "+ug1.getCity());
		ug1.StudentBranch();
	}

}
