package com.mahait.programs;
public class IntegerSum {

	static int getSum(int n)
    {
        int sum = 0;
        
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 6874;
 
        System.out.println("Sum of inteher is : "+getSum(n));
        
        // 2nd Approch
        char [] chars = String.valueOf(n).toCharArray();
        int temp=0;
        for (char c : chars) {
			temp = temp + Character.getNumericValue(c);
		}
        System.out.println("Sum of integer is : "+temp);
    }
}


