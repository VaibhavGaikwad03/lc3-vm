/*
Accept the number from the user and print below pattern

*   *   *   *
*   *   *
*   *
*

*/

import java.lang.*;
import java.util.*;

class PatternPrint
{
    public void Pattern(int iValue)
    {
        int i = 0, j = 0;

        for(i = iValue; i > 0; i--)
        {
            for(j = 0; j < i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

class Pattern_Print_2
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