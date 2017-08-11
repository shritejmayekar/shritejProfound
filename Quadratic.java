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
public class Quadratic {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            
            System.out.println("Enter value for a:");
            double a=input.nextDouble();
            
            System.out.println("Enter value for b:");
            double b=input.nextDouble();
            
            
            System.out.println("Enter value for c:");
            double c=input.nextDouble();
            
            double delta=Math.pow(b, 2)-4*a*c;
            
            if(delta==0)
            {
                System.out.println("Roots are real and same");
                double Realroot=-b/(2*a);
                System.err.println("Root:"+Realroot);
            }
            else if(delta>0)
            {
                
            }
            
            
    }
    
}
