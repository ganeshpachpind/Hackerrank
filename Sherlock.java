/*Sherlock and The Beast
Sherlock Holmes is getting paranoid about Professor Moriairty, his archenemy. All his efforts to subdue Moriarty have been in vain. These days Sherlock is working on the conversation he had with Dr. Watson. Watson mentioned that the CIA have been having weird problems with their supercomputer ‘The Beast’ recently.

This afternoon, Shelock received a note from Moriarty, saying he has infected ‘The Beast’ with a virus. In addition the note had the number ‘k’ printed on it. After doing some calculations, Sherlock found out that the key to remove the virus is the largest ‘Decent’ Number having ‘k’ digits.

A ‘Decent’ Number has -
1. Only 3 and 5 as its digits.
2. Number of times 3 appears is divisible by 5.
3. Number of times 5 appears is divisible by 3.

Meanwhile, the counter to destruction of ‘The Beast’ is running very fast. Can you save ‘The Beast’ and find the key before Sherlock?

Input Format
1st line will contain an integer T, the number of test cases, followed by T lines, each line containing an integer N i.e. the number of digits in the number 

Output Format
Largest Decent number having N digits. If no such number exists, you tell Sherlock that he is wrong and print ‘-1’ 

Constraints
1<=T<=20
1<=N<=100000


Sample Input

4
1
3
5
11
Sample Output

-1
555
33333
55555533333
Explanation
For N=1 , there is no such number. 
for N=3, 555 is only possible number.
For N=5, 33333 is only possible number.
For N=11 , 55555533333 and all of permutations of digits are valid numbers, among them, the given number is the largest one.
*/

import java.util.Scanner;
class Sherlock
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();	 
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
         a[i]=sc.nextInt();
	  }
      for(int i=0;i<n;i++)
	  {
         find(a[i]);		 
	  } 	  
	  
  }

  public static int  find(int N)
	{
	  if(N<3)
		{
		  System.out.println(-1);
		  return 0;
	    }		
	  else if(N%3==0)
		 {
		  // that many times direct 5
		  for(int x=0;x<N;x=x+3)
			{
			   System.out.print("555");			  
			}
			System.out.println(" ");
          return 0;
		}		
		else if(N==4)
		{
            System.out.println("-1");
			return 0;
		}
		else if(N==5)
		{
		   System.out.println("33333");
		   return 0;
		}
		else if (N>5)
		{
			// combination of 5 or 3
			for(int i=1;(N-(5*i))>0;i++)
			{
				if((N-(5*i))%3==0)
				{								
					int num5=(N-(5*i));				
					int num3=N-num5;
					int val=num5/3;
					char a[]=new char[val];
					for(int k=0;k<val;k++)
					{
                     a[k]='5';
					}
					while(num5!=0)
					{
						System.out.print(a);
						num5=num5-val;
					}
					while(num3!=0)
					{
						System.out.print("33333");
                        num3=num3-5;						
					}					
					System.out.println(" ");
					return 0;
				}				
            }   
			
		}
		if(N%5==0)
		{
			for(int x=0;x<N;x++)
			{
			   System.out.print(3);			   
			}
            System.out.println(" ");
			return 0;
		}
		else
		{
			System.out.println("-1");
		}
		return 0;
	}
}
