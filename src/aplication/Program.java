package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangle rectangle = new Retangle();
	
		System.out.println("Enter rectangle width and height: ");
		System.out.print("First, enter the width: ");
		rectangle.width = sc.nextDouble();

		System.out.print("Now enter the height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.data());
		
		sc.close();
		
		
		
//		System.out.println(Retangle);
		
		
		
	}

}
