import java.util.Scanner;

class Leap {
    public static void main(String args[]) {
    Scanner leapyear = new Scanner(System.in);
      System.out.println("Enter the year:");
        int year = leapyear.nextInt();
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("Year " + year + " is a Leap year.");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
