package com.msrit.StudentPackage;

import java.util.Scanner;

public class RegisterStudent {
	int credits;
	Scanner scanner= new Scanner(System.in);
	RegisterStudent()
	{
		System.out.println("Enter the number of credits ");
		credits=scanner.nextInt();
		if(credits>30) {
			System.out.println("Exceptions cannot have more than 30 credits");
		}
			
	}
}
