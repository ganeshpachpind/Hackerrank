/*
IIT-Delhi Competition
Given a range of numbers (BOTH INCLUSIVE), print the number of numbers, sum of whose digits is a prime number.

Note: 1 is NOT considered to be a prime number.


Input

First line contains the number of test cases T.

Each test case consists of two lines, each line containing one integer. First integer L gives the beginning of the range of values and the second integer U gives the end of range.


Output

One integer in a new line which gives the number of numbers that satisfy the given condition.


Constraints

1 = T = 100

1 = L = U = 10,000


Example

Input:
3
11
21
3
11
10
20

Output:
6
4
5

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class NumberOfNumber
{
	public static boolean IsPrime(int number) 
		{
			for (int i = 2; i < number; i++) 
				{
					if (number % i == 0 && i != number) 
						return false;
				}
				return true;
		}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        ArrayList <Integer>a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			// get two number
			int start=sc.nextInt();
			int end=sc.nextInt();
			int count=0;
			while(start<=end)
			{
				int num=start;
				int addnum=0;
				while(num!=0)
				{
					addnum=addnum+(num%10);
					num=(int)(num/10);
				}				
				
				if(IsPrime(addnum)&&(addnum!=1))
					{
					
						count++;
					}
				
				start++;
			}
			
              a.add(count);
	  } 
	  Iterator i=a.iterator();
         while(i.hasNext())
		 {
			  System.out.println(i.next());
		 }

    }	
}
