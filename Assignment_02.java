package com.logilite.task;

public class Assignment_02 {
	public static void main(String[] args) {
		String s="This is a Pankaj";
		char ca[]=s.toCharArray();
		System.out.println("hi");
		//toggeling the character
		for (int i = 0; i <s.length(); i++) 
		{
			if(ca[i]>64 && ca[i]<91)
			{
				ca[i]=(char) (ca[i]+32);
			}
			else if(ca[i]>96 && ca[i]<123) 
			{
				ca[i]=(char) (ca[i]-32);
			}
			
		}
		String reverse="";
		s=new String(ca);
		//reverse the word
		String sa[]=s.split(" ");
		String word="";
		for (int i = 0; i < sa.length; i++) {
			word=sa[i];
			
			for (int j = 0; j < sa[i].length(); j++)
			{
				reverse=reverse+sa[i].charAt(j);
			}
			reverse=reverse+" ";
		}
		
     //display the resultant string
		System.out.println(reverse);
	
	}
	
	

}
