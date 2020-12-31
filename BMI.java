
/**
 * This program takes user input for use height and weight to calculate BMI
 *
 * @author (Kim Villatoro)
 * @version (12/30/2020)
 */
public class BMI
{
    // instance variables
    /**
     * name, weight, height
     * calculation for BMI
     * (weight/height^2) * 703
     * 
     * 
     */
    private String name;
    private double weight;
    private double height;
    
    

    /**
     * Constructor for objects of class BMI
     */
    public BMI(String name, double weight, double height)
    {
       this.name = name;
       this.weight = weight;
       this.height = height;
    }

    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double calculateBMI()
    {
        double bmi = (weight / (height * height)) * 703;
        bmi = Math.round(bmi * 100)/100.0;
        return bmi;
    }
    
    public String getStatus()  {
        double bmi = calculateBMI();
        if(bmi < 18.5){  // Condition for underweight range
            return "underweight";
        }
        else if (18.5 < bmi && bmi < 25)    {
            return "normal weight";
        }
        else if (bmi > 25){  // Condition for overweight range
            return "overweight";
        }
        else {
            return null;
        }
    }
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setWeight(double weight)  {
        this.weight = weight;  
    }
    
    public void setHeight(double height)  {
        this.height = height;  
    }
    
}

    


