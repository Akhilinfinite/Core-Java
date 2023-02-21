package com.java.day1.task2;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		int a;
		try (Scanner sc = new Scanner(System.in)) {
			a=sc.nextInt();
		}
		switch(a) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Thusday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Enter vaild week number");
		break;
		}

	}

}
