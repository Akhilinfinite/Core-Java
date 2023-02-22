package com.java.day2;

import java.util.Scanner;

public class Task2 {
	//Function for swapping of the characters
		public static String swapString(String a, int i, int j) {    
	        char[] b =a.toCharArray();    
	        char ch;    
	        ch = b[i];    
	        b[i] = b[j];    
	        b[j] = ch;    
	        return String.valueOf(b);    
	    }    
	            
	        
	    //function to print the possible strings with given string   
	    public static void generatePermutation(String str, int start, int end)    
	    {    
	        //Prints the permutations    
	        if (start == end-1)    
	            System.out.println(str);    
	        else    
	        {    
	            for (int i = start; i < end; i++)    
	            {    
	                //Swapping the string   
	                str = swapString(str,start,i);    
	                // calling generatePermutation function for rest of the characters     
	                generatePermutation(str,start+1,end);    
	                //Backtracking and swapping the characters again.    
	                str = swapString(str,start,i);    
	            }    
	        }    
	    }
	    public static void main(String[] args)    
	    {    
	    	try (Scanner sc = new Scanner(System.in)){
		    System.out.println("Enter the String : ");
	        String str = sc.nextLine();  
	        int len = str.length();    
	        System.out.println("Possible Strings for the given String: ");    
	        generatePermutation(str, 0, len);
	    	}
	    }
}
