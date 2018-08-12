package demo;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("What day is it today - ?");
		String day = k.nextLine();
		
		switch(day) {
		case "Monday":
			System.out.println("Wear a white dress today");
			break;
			
		case "Tuesday":
			System.out.println("Wear an Orange dress today");
			break;
			
		case "Wednesday":
			System.out.println("Wear a red dress today");
			break;
			
		case "Thursday":
			System.out.println("Wear a yellow dress today");
			break;
			
		case "Friday":
			System.out.println("Wear a magenta dress today");
			break;
			
		case "Saturday":
			System.out.println("Wear a pink dress today");
			break;
			
		case "Sunday":
			System.out.println("Wear a brown dress today");
			break;
			
		}
	}

}
