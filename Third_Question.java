package assignment2;

import java.util.Scanner;

public class Third_Question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of Students:- ");
		int num = sc.nextInt();
		
		Object[] arr = new Object[num];
		
		for(int i=1; i<=arr.length; i++) {
			System.out.println("Please Enter your Name:- ");
			String name = sc.next();
			System.out.println("Please Enter your Email:- ");
			String email = sc.next();
			System.out.println("Please Enter your PhoneNumber:- ");
			long Phone = sc.nextLong();
			System.out.println("Please Enter your address:- ");
			String address = sc.next();
			System.out.println("Please Enter your Status:- ");
			String Status = sc.next();
		}
		System.out.println("Please Enter which student detail you are looking for:- ");
		int numb = sc.nextInt();
		if (numb ==1) {
			
		}

	}

}
