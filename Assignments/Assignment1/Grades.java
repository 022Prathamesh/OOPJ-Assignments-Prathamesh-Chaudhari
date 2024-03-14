import java.util.Scanner;

class Grades { 
  public static void main(String []args){
Scanner marks = new Scanner(System.in);

System.out.println("Enter your marks:");

int grades = marks.nextInt();


if(grades >= 80){
System.out.println("You've got an A.");
}
else if ((grades >= 70) && (grades < 80)){
System.out.println("You've got a B.");
}
else if ((grades >= 60) && (grades < 70)){
System.out.println("You've got a C.");
}
else if ((grades >= 50) && (grades < 60)){
System.out.println("You've got an D.");
}
else if ((grades >= 40) && (grades < 50)){
System.out.println("You've got an D.");
}
else 
System.out.println("You've got an F");
}
}