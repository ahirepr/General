package com.logilite.task;
import java.util.Scanner;

public class Assignment_03 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		int len=(n*2)-1;
		if(n%2==0)
		{
		int b=65;
		for (int i = 0; i<len; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(j-i>=n-len && i+j>n-2)
				{
					System.out.print((char)b+" ");
					b++;
					if(b>90)
						b=65;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	  }
	 else
	 {
		int a=1;	
		for (int i = 0; i<len; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				if(j-i>=n-len && i+j>n-2)
				{
					System.out.print(a%10+" ");
					a++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
		sc.close();
	}

	
	
}
