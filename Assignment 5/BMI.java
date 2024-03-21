
import java.util.Scanner;




public class BMI {
    private double height;
    private double weight;
    public BMI(double height, double weight){

        this.height=height;
        this.weight=weight;
    }
       
   
    double calculateBMI(){
        double BMI=weight/(height*height);
        return BMI;
    }

    public  double getheight(){
        return height;
    }
    public void  setheight(double height){
        this.height=height;
    }
    public double getweight(){
        return weight;
    }
    public  void setweight(double weight){
this.weight=weight;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        double height=sc.nextDouble();
        double weight=sc.nextDouble();

        BMI b =new BMI(height,weight);
        
        System.out.println("BMI calculator :"+b.calculateBMI());




    }
    
    
}
