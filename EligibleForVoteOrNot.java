package Session2;

import java.util.Scanner;

public class EligibleForVoteOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter any age");
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		if(age>=18)
		{
			System.out.println("Person is eligible to vote");
		}
		else
		{
			System.out.println("Person is not eligible");
		}

	}

}
