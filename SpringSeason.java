public class SpringSeason {
    
    public static boolean isSpringSeason(int m,int d)
    {
        int day,month;
        day=d;
        month=m;
        if(((month>=3)&&((day<=31)&&(day>=20))&&(month<=6)))
        {
			if((day>20)&&(month==6))
			{
				return false;
			}
			
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
            
        int m=Integer.parseInt(args[0]);//month
        int d=Integer.parseInt(args[1]); //day
        
        if(isSpringSeason(m, d))
        {
            System.out.println("SpringSeason "+isSpringSeason(m, d));
        }
        else
        {
            System.out.println("SpringSeason "+isSpringSeason(m, d));
        }
        
    }
    
}
