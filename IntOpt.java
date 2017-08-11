
package bridgelab;

import java.util.Scanner;


public class IntOpt {
    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a:");
        int a=input.nextInt();
        System.out.print("\nEnter b:");
        int b=input.nextInt();
        System.out.print("\nEnter c:");
        int c=input.nextInt();
        System.out.println("=========Integer Opeartions=========");
        int Operation1=a+b*c;
        System.out.println("a+b*c="+Operation1); 
        int Operation2=a*b+c;
        System.out.println("a*b+c="+Operation2);
        int Operation3=c+(a/b);
        System.out.println("c+a/b="+Operation3);
        int Operation4=(a%b)+c;
        System.out.println("a%b+c="+Operation4);
    }
    
}
