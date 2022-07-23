/*
Accept the rows and columns from the user and display below pattern

1   2   3   4
    1   2   3
        1   2
            1

*/

import java.lang.*;
import java.util.*;

class PatternPrint
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0, j = 0, Pattern = 0;

        for(i = 1; i <= iRow; i++)
        {
            Pattern = 0;

            for(j = 1; j <= iCol; j++)
            {
                if(i <= j)
                {   Pattern++;
                    System.out.print(Pattern+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}

class Pattern_Print_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        int iNo2 = sobj.nextInt();

        PatternPrint pobj = new PatternPrint();

        pobj.Pattern(iNo1, iNo2);
    }
}