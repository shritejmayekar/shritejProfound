public class CarLoan {
    public static void main(String[] args) {
            
        double Principal=Double.parseDouble(args[0]);
        double Year=Double.parseDouble(args[1]);
        double Rate=Double.parseDouble(args[2]);
        //Assign values
        double n=12*Year;
        double r=Rate/(12*100);
        double payment=(Principal*r)/(1-Math.pow(1+r, -n));
        
        System.out.println("The monthly payment:"+payment);
        
    }
    
}
