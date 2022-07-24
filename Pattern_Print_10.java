/*
Accept the number from the user and display below pattern

1   2   3   4   5
1   2           5
1       3       5
1           4   5
1   2   3   4   5

*/

import java.lang.*;
import java.util.*;

class PatternPrint
{
    public void Pattern(int iValue)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iValue; i++)
    {
        for(j = 1; j <= iValue; j++)
        {
            if((i == 1) || (i == iValue) || (j == 1) || (j == iValue) || (i == j))
            {
                System.out.print(j+"\t");
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

class Pattern_Print_10
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        PatternPrint pobj = new PatternPrint();

        pobj.Pattern(iNo);
    }
}