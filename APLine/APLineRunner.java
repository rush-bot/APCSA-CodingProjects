//APLine Runner - Rushil Desai
public class APLineRunner {
    public static void main(String[] args) {
        
        //Test Case #1
        APLine line1 = new APLine (5, 4, -17);
        double slope1 = line1.getSlope ();
        System.out.println(slope1); 
        Boolean onLine1 = line1.isOnLine (5, -2);
        System.out.println(onLine1); 

        //Test Case #2
        APLine line2 = new APLine (-25, 40, 30);
        double slope2 = line2.getSlope ();	
        System.out.println(slope2); 
        Boolean onLine2 = line2.isOnLine (5, -2);
        System.out.println(onLine2); 
    }
}
