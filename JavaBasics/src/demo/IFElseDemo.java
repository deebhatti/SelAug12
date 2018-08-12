package demo;

import java.util.Scanner;

public class IFElseDemo {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Which coffee would you like - Small/Medium/Large ?");
		String choice = k.nextLine();
		
		if(choice.equals("Small")) {
			System.out.println("Price = $1");
		}
		
		else if(choice.equals("Medium")) {
			System.out.println("Price = $2");
		}
		
		else if(choice.equals("Large")) {
			System.out.println("Price = $3");
		}
			
	}

}
