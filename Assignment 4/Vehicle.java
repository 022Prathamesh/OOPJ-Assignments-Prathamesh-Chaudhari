import java.util.Scanner;

class Vehicle{
    public static void Car(){
        System.out.println("Toto");
    }

    public static void Car(int n){
        int i = 0;
        do{
            System.out.println("TOTO");
            i++;
        }while (i < n);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle.toto();
        Vehicle.TOTO(2);
         
    }
}