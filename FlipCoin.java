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
public class FlipCoin {
    public static void main(String[] args) {
            
        if(Math.random()<0.5)
            System.out.println("Head");
        else
            System.out.println("Tail");
    }
    
}
