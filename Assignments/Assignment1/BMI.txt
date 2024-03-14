import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

     
        double bmi = weight / (height * height);

        
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }


        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Category: " + category);
    }
}
