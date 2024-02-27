package com.mahait.strings;

import java.util.Scanner;

public class ReverseStringPreservingSpace {
	static void reverseString(String inputString)
    {
        char[] inputStringArray = inputString.toCharArray();
        char[] resultArray = new char[inputStringArray.length];
        
        for (int i = 0; i < inputStringArray.length; i++) 
        {
            if (inputStringArray[i] == ' ') 
            {
                resultArray[i] = ' ';
            }
        }
         
        int j = resultArray.length-1;
        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ') 
            {
                if(resultArray[j] == ' ')
                {
                    j--;
                }
                resultArray[j] = inputStringArray[i];
                j--;
            }
        }
        System.out.println("==== 1st Approch ========");
        /*System.out.println(inputString+" ---> "+String.valueOf(resultArray));*/
        System.out.println(String.valueOf(resultArray));
    }
     
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Santance :");
    	 String nextLine = sc.nextLine();
        reverseString(nextLine);
        
        // 2nd Approch
        String temp ="";
        for(int rev = nextLine.length()-1; rev >= 0 ; rev--) {
        	if(nextLine.charAt(rev) != ' ') {
        	temp = temp + nextLine.charAt(rev);
        	}
        }
        StringBuffer sb= new StringBuffer(temp);
        for(int i=0 ; i<nextLine.length(); i++){
        if(nextLine.charAt(i)== ' '){
        	sb.insert(i, " ");
        }
     }
        System.out.println("==== 2nd Approch ========");
     System.out.println(sb);
        
    }
}
