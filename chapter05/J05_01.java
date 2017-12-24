package chapter05;

import java.io.IOException;
import java.util.Scanner;

public class J05_01 {


	public static void main(String args[]) throws IOException { 

		Scanner scnr = new Scanner(System.in);

		System.out.print("Enter your age: ");

		int Age = scnr.nextInt();

		if(Age<=0)
			System.out.println("You have not borned yet!");
		
		if(Age>0 && Age<=11)
			System.out.println("You are a child.");
		
		if(Age>11 && Age<=18)
			System.out.println("You are a teen ager.");
		
		if(Age>18 && Age<=41)
			System.out.println("You are young.");
		
		if(Age>41)
			System.out.println("Wish your long life.");
		
		scnr.close();
		
	}

}
