/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgelab;

import java.util.Scanner;

/**
 *
 * @author Shritesh
 */
public class LeapYear {
    public static boolean isLeapYear(int year)
    {
        if(year%400==0)
        {
            return true;
        }
        else if(year%100==0)
        {
            return false;
            
        }
        else if(year%4==0)
        {
                return true;
        }
        
            
        return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Year:");
        int Year=input.nextInt();
        if(Year>=1582)
        {
            if(isLeapYear(Year))
            {
                System.out.println("The "+Year+"  is an Leap Year");
                
            }
            else
            {
                System.out.println("The "+Year+" is not an Leap Year");
            }
        }
        else
        {
            System.out.println("Year is not acccording to Gregorian Calender");
        }
        
    }
    
}
