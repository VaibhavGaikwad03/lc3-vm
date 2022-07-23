/*
Accept the number from the user and display below pattern

$   *   *   *   *
#   $   *   *   *
#   #   $   *   *
#   #   #   $   *
#   #   #   #   $

*/

import java.lang.*;
import java.util.*;

class PatternPrint
{
    public void Pattern(int iValue)
    {
        int i = 0, j = 0;

        for(i = 0; i < iValue; i++)
        {
            for(j = 0; j < iValue; j++)
            {
                if(i == j)
                {
                    System.out.print("$\t");
                }
                else if(i < j)
                {
                    System.out.print("*\t");
                }
                else if(i > j)
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}

class Pattern_Print_3
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