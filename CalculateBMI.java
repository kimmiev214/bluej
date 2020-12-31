import java.util.Formatter;
/**
 * Write a description of class CalculateBMI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculateBMI
{
    public static void main(String[] args)  {
        BMI jay = new BMI("Jay", 200, 67);
        
        
        System.out.format("%s's"+ " BMI is: %f." + " The nutritional status states that %s" +
        " is %s.", jay.getName(), jay.calculateBMI(), jay.getName(), jay.getStatus());

    }
    
}