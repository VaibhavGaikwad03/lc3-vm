/*
Accept the number from the user and display below pattern

*   *   *   *   *   *
*               *   *
*           *       *
*       *           *
*   *               *
*   *   *   *   *   *

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
            for(j = iValue-1; j >= 0; j--)
            {
                if((i-1 == j) || (i == 1) || (i == iValue) || (j == iValue-1) || (j == 0))
                {
                    System.out.print("*\t");
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

class Pattern_Print_8
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