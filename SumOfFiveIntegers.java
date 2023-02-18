package JavaPrograms;

import java.util.Scanner;

public class SumOfFiveIntegers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Five Integers: ");
		
		int a,b,c,d,e;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		e = s.nextInt();
		
		int sum = a + b + c + d + e;
		
		System.out.println("Sum of Five Integers is : " + sum);
		
		
		s.close();

	}

}
