
package bridgelab;

import java.util.Scanner;


public class DoubleOpt {
    
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a:");
        double a=input.nextDouble();
        System.out.print("\nEnter b:");
        double b=input.nextDouble();
        System.out.print("\nEnter c:");
        double c=input.nextDouble();
        System.out.println("=========Integer Opeartions=========");
        double Operation1=a+b*c;
        System.out.println("a+b*c="+Operation1); 
        double Operation2=a*b+c;
        System.out.println("a*b+c="+Operation2);
        double Operation3=c+(a/b);
        System.out.println("c+a/b="+Operation3);
        double Operation4=(a%b)+c;
        System.out.println("a%b+c="+Operation4);
    }
    
    
    
}
