
/**
 * Write a description of class Fuel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fuel1   
{  
   /**
    * day that fill-up is done
    */
   public int day=0; 
   /**
    * starting mileage for a fill-up
    */
   public int sMiles=0; 
   /**
    * ending mileage for a fill-up
    */
   public int eMiles=0; 
   /** 
    * total distance travelled in between a fill-up
    */
   public int dist=0; 
   /**
    * total gallons consumed in between a fill-up
    */
   public double gals=0;
   /**
    * miles per gallon in between a fill-up
    */
   public double mpg = 0.0;
   
   // constructor
   /* Using default constructor in this program. */
   
   /**
    * Function calcDistance calculates the total distance traveled
    * 
    * @param sMiles starting mileage of the car
    * @param eMiles ending mileage of the car
    * @return totalDistance  total distance traveled in between this fill-up
    */
   public int calcDistance(int sMiles, int eMiles){
       return eMiles - sMiles;
      
    }
    
   /**
    * Function calcMPG calculates the total Miles Per Gallons for the car
    * 
    * @param dist total distance travelled in between this fill-up
    * @param gal  total gallons consumed in between this fill-up
    * @return MPG miles/gallon in between this fill-up
    */
   public double calcMPG(int dist, double gals){
       return dist/ gals;
   }
   
   /**
    * The Main function
    * 
    * @param args arguments from console. 
    * @return none
    */
   public static void main(String[] args){
       //declaration of the variables
       int day1=1; 
       int sMiles1=10000; 
       int eMiles1=10440; 
       int dist1=0; 
       double gals1=10.0;
       double mpg1 = 0.0;
       
       //invoking the constructor
       Fuel1 car1  = new Fuel1();  // default constructor used.
       
       // Initiate all instance variables. 
       car1.day    = day1;     // day of the fill-up, reserved for future use. 
       car1.sMiles = sMiles1; 
       car1.eMiles = eMiles1;
       car1.gals   = gals1;
       car1.dist   = car1.calcDistance(car1.sMiles, car1.eMiles); //the distance traveled
       car1.mpg    = car1.calcMPG(car1.dist, car1.gals);          //the total MPG 
       
       //Printing the following onto the screen
       System.out.printf("%45s%n", "Gas Mileage Calculations");
       System.out.printf("%12s    ", "Type of Car");
       System.out.printf("%10s ", "Start Miles");
       System.out.printf("%10s ", "End Miles");
       System.out.printf("%10s", "Distance");
       System.out.printf("%10s ", "Gallons");
       System.out.printf("%10s%n", "Miles/Gal");
       System.out.println("======================================================================");
       System.out.printf("%8s", "09 Toyota Prius");
       System.out.printf("%8d    ", car1.sMiles);
       System.out.printf("%8d   ", car1.eMiles);
       System.out.printf("%8d      ", car1.dist);
       System.out.printf("%6.2f   ", car1.gals);
       System.out.printf("%7.2f%n", car1.mpg);
       
    }
}
