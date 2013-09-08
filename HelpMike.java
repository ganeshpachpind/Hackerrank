/*
Help Mike
Harvey Specter has agreed to take Mike Ross to a meeting with NSA filled with brilliant scientists. But, as always, its not going to be easy for Mike. He has to solve a puzzle given by Harvey.

Harvey gives two numbers N and K and defines a set A.

A = { x : x is a natural number = N }
(i.e), A = {1,2,3,4,5,6,…., N}

Mike has to find the total number of pairs of elements A[i] and A[j] belonging to the given set such that i < j and their sum is divisible by K

Input Format
An integer T followed by T lines, each containing a pair of integers N and K separated by a single space.

Output Format
T integers on separate lines each corresponding to the answer to that test case.

Constraints
1<=T<=100
K<=N<=109 
1<=K<=10000

Sample Input

2
10 4
7 3
Sample Output

10
7
Explanation

For the 1st test case, there are 10 pairs whose sum is divisible by 4. 
(1,3), (1,7), (2,6), (2,10), (3,5), (3,9), (4,8), (5,7), (6,10) and (7,9)

For the 2nd test case, there are 7 pairs whose sum is divisible by 3. 
(1,2), (1,5), (2,4), (2,7), (3,6), (4,5) and (5,7)
*/

import java.util.Scanner;

class HelpMike 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int  n=sc.nextInt();
	  long  N[]=new long [n];
	  long  K[]=new long [n];
	  for(int  i=0;i<n;i++)
	  {
		  N[i]=sc.nextInt();	  
		  K[i]=sc.nextInt();
	  }
	  for(int  i=0;i<n;i++)
	  {
		  count(N[i],K[i]);
	  }
  }
  public static void count(long  N,long  K)
	{
	   long count=0;
           long groups=(long)N/K;
	   long pairs=(((groups-1)*(groups))/2);
           long modrem=N%K;  
	  
	  // within range of K
	  if(K%2==0)
	  {
		  count=count+(((K/2)-1)*groups);	
		  //in gruoup of 2 exact K number of pairs	 
	          count=count+(K*(pairs));
		  //pairs formed within remainder 
		  if((modrem-(K/2))>0)
		   {
		    count=count+(modrem-(K/2));
		   }
		  
	  }
	  else // if K is odd
	  {
		   count=count+(((K-1)/2)*groups);
		   //in gruoup of 2 exact K number of pairs	 
	           count=count+(K*(pairs));
		   //pairs formed within remainder
		   if((modrem-((K-1)/2))>0)
		   {
		    count=count+(modrem-((K-1)/2));
		   }
	  }	 	  
	  
	  // pairs formed with remainder and groups
	  count=count+(modrem*groups);
	  System.out.println(count);
	}
}
