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
public class SumOfTwoDice {
    public static void main(String[] args) {
          double dice1=0;
          double dice2=0;
          int sum=0;
            for(int i=0;i<6;i++)
            {
                 dice1=Math.random()*6;
                 dice2=Math.random()*6;
                
            }
            sum=(int) (dice1+dice2);
            System.out.println("Dice1: "+dice1+"\tDice2: "+dice2);
            System.out.println("sum="+sum);
    }
    
}
