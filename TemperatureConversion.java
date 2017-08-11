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
public class TemperatureConversion {
    
    public static double cTof(double cel)
    {
        double fahr=(cel*9/5)+32;
        return fahr;
    }
    public static double  fToc(double fahr)
    {
        double cel=(fahr-32)*5/9;
        return cel;
    }
    
    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
        boolean loop=true;
        while(loop)
        {
            System.out.println("\nPlease Make choice\n1.Celsius to Fahrenheit"
                    + "\n2.Fahrenheit to Celsius\n3.Exit"); 
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the Temperature in Celsius:");
                    double Celsius=input.nextDouble();
                    System.out.println(Celsius+" Celsius in Fahrenheit:"+cTof(Celsius));
                    break;
                case 2:
                    System.out.print("Enter the Temperature in Fahrenheit:");
                    double Fahr=input.nextDouble();
                    System.out.println(Fahr+"  Fahrenheit in Celsius:"+fToc(Fahr));
                    break;
                case 3:
                    loop=false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    
}
