import java.util.Scanner;


public class Book {
   private String title;
   private String author;
   private String publisher;
   private int year;
   private double price;
   private int quantity;

   public Book(String title, String author, String publisher, int year, double price, int quantity){
    this.title=title;
    this.author=author;
    this.publisher=publisher;
    this.year=year;
    this.price=price;
    this.quantity=quantity;

   }



  public  String getTitle(){
    return title;
   }
   public void setTitle(String title){
    this.title=title;
   }
   public  String getAuthor(){
    return author;
   }
   public  String getPublisher(){
    return author;
   }
  public void setPublisher(String publisher){
      this.publisher=publisher;  
    }
    public int getYear(){
        return year;
       }
        public void setYear(int year){
          this.year=year;  
        }
        public double getPrice(){
            return price;
           }
            public void setPrice(double price){
              this.price=price;  
            }
            public int getQuantity(){
                return quantity;
               }
                public void setQuantity(int quantity){
                  this.quantity=quantity;  
                }
                public void increaseQuantity(int quantity) {
                    this.quantity += quantity;
                }
                public void decreaseQuantity(int quantity){
                  if(this.quantity>=quantity)
                  {
                    this.quantity-=quantity;
              

                  }
                  else{
                    System.out.println("Insufficient Quantity available!");
                  }
                }

                public  double getInventoryValue(){
                  return price*quantity;
                }
                public static void main(String args[]) {
                  Book b =new Book("JAVA PROGRAMMING!", "Sandeep Sir","CDAC",2024,400,10);
                  System.out.println("Book Title: " + b.getTitle());
                  System.out.println("Book Author: " + b.getAuthor());
                  System.out.println("Book Publisher: " + b.getPublisher());
                  System.out.println("Book Year: " + b.getYear());
                  System.out.println("Book Price: " + b.getPrice());
                  System.out.println("Book Quantity: " + b.getQuantity());

                  b.increaseQuantity(10);
                  System.out.println("Quantity after increase: "+b.getQuantity());

                  b.decreaseQuantity(5);
                  System.out.println("Quantity after decrease: "+b.getQuantity());

                System.out.println("Inventory value $: "+b.getInventoryValue());
                }
}


                  





            
            
            







