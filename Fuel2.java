import java.util.Scanner; // import Scanner class
/**
 * Fuel2 is a program used to calculate the fuel economy of your family or personal car for one fill-up
 *
 * @author Kim Villatoro
 * @version 12/27/2020
 */
public class Fuel2
{
    //instance variables
    private int day = 0; //day car was filled
    private int sMiles = 0; //start miles
    private int eMiles = 0; //end miles
    private int distance = 0; //distance
    private double gal = 0.0; //gallons
    private double mpg = 0.0; //miles/gallon
    
    //default constructor will be used 
    public int calcDistance(int sMiles, int eMiles) {
        distance = eMiles-sMiles;
        return distance;
    }
    public double calcMpg(int distance, double gal) {
        mpg = distance/gal;
        return mpg;
    }

    public static void main(String[] args)  {
        
        Fuel2 car1 = new Fuel2();
        car1.sMiles = 10000;
        car1.eMiles = 10440;
        car1.distance = car1.calcDistance(car1.sMiles,car1.eMiles);
        car1.gal = 10.0;
        car1.mpg = car1.calcMpg(car1.distance, car1.gal);
        
  
        Scanner input = new Scanner(System.in); // create Scanner object
        System.out.println("Enter the year and model of your car");
        String typeOfCar = input.nextLine(); // read user input
        
        System.out.printf("     Type of Car: ");
        System.out.printf("     Start Miles: ");
        System.out.printf("     End Miles: ");
        System.out.printf("      Distance: ");
        System.out.printf("      Gallons: ");
        System.out.printf("     Miles/Gal: ");
        System.out.println("\n ==================================================================================================");
        System.out.printf(" "+ typeOfCar);
        System.out.printf("      "+ car1.sMiles);
        System.out.printf("        "+ car1.eMiles);
        System.out.printf("             "+ car1.distance);
        System.out.printf("               "+ car1.gal);
        System.out.printf("         "+ car1.mpg);
        


        
        
        
        
    }
}
