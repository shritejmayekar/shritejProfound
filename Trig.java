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
public class Trig {
    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the angle:");
        double degree=input.nextInt();
        
      double  radian=Math.toRadians(degree);
      double sine=Math.sin(radian);
      double cosine=Math.cos(radian);
      
        System.out.println("Angle in radians:"+radian);
        System.out.println("Sine :"+sine);
        System.out.println("Cosine :"+cosine);
    }
    
}
