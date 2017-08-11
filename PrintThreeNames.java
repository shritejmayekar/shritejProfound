
package bridgelab;

import java.util.Scanner;

public class PrintThreeNames {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three  Names:");
        String Name1=input.next();
        String Name2=input.next();
        String Name3=input.next();
        System.out.println("==========");
        System.out.println("Hi "+Name3+","+Name2+" and "+Name1);
        
        
                
    }
    
}
