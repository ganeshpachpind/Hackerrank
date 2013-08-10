/*Mark and Toys
Mark and Jane are very happy after having their first kid. Their son is very fond of toys. Therefore, Mark wants to buy some toys for his son. But he has a limited amount of money. But he wants to buy as many unique toys as he can. So, he is in a dilemma and is wondering how he can maximize the number of toys he can buy. He has N items in front of him, tagged with their prices and he has only K rupees.

Now, you being Mark’s best friend have the task to help him buy as many toys for his son as possible.

Input Format
The first line will contain two inputs N and K, followed by a line containing N integers

Output Format
Maximum number of toys Mark can buy for his son.

Constraints
1<=N<=105
1<=K<=109
1<=price of any toy<=109

Sample Input

7 50
1 12 5 111 200 1000 10
Sample Output

4
Explanation

He can buy only 4 toys at most. These toys have the following prices: 1,12,5,10.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int total=0,count=0;
        for(int i=0;i<n;i++)
        {
            total=total+a[i];
            if(total>=k)
            {
                break;
            }
            else
            {
                count++;
            }            
        }
        System.out.println(count);
    }
}
