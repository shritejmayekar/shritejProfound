public class Distance {
    public static void main(String[] args) {
            //Taking two  values
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int distance=(int) Math.pow(x, 2)+(int)Math.pow(y, 2);
        distance=(int) Math.sqrt(distance);
        
        System.out.println("The Euclidean distanec from origin:"+distance);
        
        
        
    }
    
}
