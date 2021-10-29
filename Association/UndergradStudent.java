package com.Association;

public class UndergradStudent extends Student {
	public void StudentBranch() 
	{
		Branch branch=new Branch();
		branch.branchJoined();
	}
	public void StudentSociety() 
	{
		CollegeSociety collegeSociety=new CollegeSociety();
		collegeSociety.societyJoined();;
	}
}
