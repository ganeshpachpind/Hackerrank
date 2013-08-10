/*Treasure Hunt***
Do you like treasure hunts? In this problem you are to write a program to explore the above array for a treasure. The values in the array are clues. Each cell contains an integer between 11 and 55; for each value the ten’s digit represents the row number and the unit’s digit represents the column number of the cell containing the next clue. Starting in the upper left corner (at 1,1), use the clues to guide your search of the array. (The first three clues are 11, 55, 15). The treasure is a cell whose value is the same as its coordinates. Your program must first read in the treasure map data into a 5 by 5 array.

Input Format

Input contains five lines each containing five space separated integers.

Output Format

If the treasure is found, your program should output the index ( row, column ) of cells it visits during its search for treasure (separated by a single space). Multiple cells must be separated by a newline “\n”.

If there is no treasure, print “NO TREASURE” ( quotes for clarity )

Sample Input

55 14 25 52 21
44 31 11 53 43
24 13 45 12 34
42 22 43 32 41
51 23 33 54 15

Sample Output

1 1
5 5
1 5
2 1
4 4
3 2
1 3
2 5
4 3
*/

import java.util.Scanner;
import java.util.Vector;
public class TreasureHunt
{
    public static void main(String[] args) 
    {
        int a[][]=new int[6][6];
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<=5;j++)
            {
                a[i][j]=sc.nextInt();
            }
        } 
        int row,col,currow,curcol;
        int x=a[1][1];
        currow=1;
        curcol=1;
        int counter=0;        
        int k=0;
  	Vector <Integer>v=new Vector<Integer>();
        while(true)
        {        
            counter++;
            x=a[currow][curcol];
            v.add(currow);
            v.add(curcol);            
            col=x%10;
            row=(int)(x/10);                        
            if((currow==row)&&(curcol==col))
            {
                for(int m=0;m<(counter*2);m++)
                {
                    System.out.println(v.elementAt(m)+" "+v.elementAt(++m));
                }                
                break;
            }
            else
            {				
                currow=row;
                curcol=col;
            }
            if(counter>=26)
            {
				System.out.println("NO TREASURE");
                break;                
            }
        }
                
        
    }
    
}
