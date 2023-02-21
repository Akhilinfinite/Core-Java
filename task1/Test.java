package com.java.day1.task1;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the persentage of the student:==");
			int per=sc.nextInt();
			/* int i, total = 0, per = 0,n=0;
			 * System.out.println("Enter number of subjects :");
			 * n=sc.nextInt();
			 * System.out.println("Enter "+ n +" subject marks:"); 
			 * for (i = 0; i < n; i++) {
			 * total+= sc.nextInt(); 
			 * } 
			 * per = (total/ n); 
			 * System.out.println("percentage of the given marks  :- "+per);
			 */
			
			  if (per >= 90) { 
				  System.out.println("A"); 
				  } 
			  else if (per >= 80) {
				  System.out.println("B"); 
				  } 
			  else if (per >= 70) { 
				  System.out.println("C"); 
				  }
			  else if (per >= 60) { 
				  System.out.println("D"); 
				  } 
			  else if (per >= 40) {
				  System.out.println("E"); 
				  } 
			  else { 
				  System.out.println("F"); 
				  }
			 
			
			/*
			 * switch(per/10){ case 10: System.out.println("A");break; case 9:
			 * System.out.println("A");break; case 8: System.out.println("B");break; case 7:
			 * System.out.println("C");break; case 6: System.out.println("D");break; case 5:
			 * System.out.println("E");break; case 4: System.out.println("E");break;
			 * default: System.out.println("F");break; }
			 */
		}
    }
}