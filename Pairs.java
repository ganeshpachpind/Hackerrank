/*Pairs
Given N integers [N<=10^5], count the total pairs of integers that have a difference of K. [K>0 and K<1e9]. Each of the N integers will be greater than 0 and at least K away from 2^31-1 (Everything can be done with 32 bit integers).

Input Format

1st line contains N & K (integers).
2nd line contains N numbers of the set. All the N numbers are assured to be distinct.

Output Format

One integer saying the number of pairs of numbers that have a diff K.

Sample Input #00:

5 2
1 5 3 4 2

Sample Output #00:

3

Sample Input #01:

10 1
363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793 

Sample Output #01:

0
*/

import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;

public class Pairs 
{
    public static void main(String[] args) 
  	{
                // takje input
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int K=sc.nextInt();
            int a[]=new int[n];
			for(int i=0;i<n;i++)
		    {
				a[i]=sc.nextInt();
		    }
        // logn time 
        	Arrays.sort(a);				
        
          int count=0;		   
          for(int i=0;i<n;i++)
          {
              for(int j=i+1;j<n;j++)
              {
                  if(Math.abs(a[i]-a[j])==Math.abs(K))
                  {
                      count++;
                  }
				  else if(Math.abs(a[i]-a[j])>Math.abs(K))
				  {
					  break;					 
				  }
              }
          }
        System.out.println(count);
    }
}
