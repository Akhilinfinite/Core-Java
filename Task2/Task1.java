package com.java.day2;

import java.util.Scanner;

public class Task1 {
	//FUNCTION TO FIND THE SECOND REPEATING CHARACTER IN THE GIVEN STRING
	private static void secondRepeatedchar(String s) {
		//INITILIZING THE COUNT TO COUNT IF THERE IS ANY REPEATED CHARACTER
		//INITILIZING THE FLAG TO COUNT THE NO OF REPEATING CHARACTER
		int count=0,flag=0;
		//COVERTING THE GIVEN STRING INTO THE CHARACTER ARRAY
		char[] s1 = s.toCharArray();
		//PARSING THROUGH THE CHARACTER ARRAY
		for (int i = 0; i < s1.length; i++) {
			//TO COMPARE THE CARACTERS IN THE GIVEN STRING PARASING FROM THE NEXT NEXT CARACTER
            for (int j = i+1; j < s1.length; j++) {
            	//COMPARING THE CARACTERS IN THE STRING
                if (s1[i] == s1[j]) {
                    count++;
                }
            }
            //INCREASING THE FLAG COUNT IF WE FIND ANY REAPEATED CARACTER
            if(count>=1) {
            	count=0;
            	flag++;
            }
            //PRINTING THE CARACTER IF THE FLAG COUNT IS 2 .
            //FLAG COUNT IS TWO MEANS THAT IS THE SECOND REPEATING CARACTER IN THE STRING AND BREAKING THE LOOP THERE
        	if(flag==2) {
        		System.out.println(s1[i]);
        		break;
        	}
            }
		//SENDING THE USER A MESSAGE SAYING THAT WE DONT HAVE THE SECOND CARACTER 
		if(flag<2) {
			System.out.println("there is no second repeated character in the given string");
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the string");
			//READING THE STRING FROM THE USER
			String s=sc.nextLine();
			//CALLING THE FUNCTION BY PASSING THE STRING AS PARAMETER
			secondRepeatedchar(s);
		}
	}

}