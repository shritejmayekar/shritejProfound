/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgelab;

/**
 *
 * @author Shritesh
 */
public class Stats5 {
    public static void main(String[] args) {
       double sum=0,avg,r=0; 
      
       for(int i=0;i<5;i++)
       {
            double RandomValue=Math.random();
           System.out.println(RandomValue);
           sum=sum+RandomValue;
          
           
       }
        System.out.println("Average="+(sum/5));
        System.out.println(r);
        
    }
}
