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
public class PowerOf2 {
    public static void main(String[] args) {
        //Range upto table will be printed 2^n
            int n=Integer.parseInt(args[0]);
            for(int i=0;i<=n;i++)
            {
                System.out.println("2^"+i+"   "+Math.pow(2, i));
            }
            
    }
    
}
