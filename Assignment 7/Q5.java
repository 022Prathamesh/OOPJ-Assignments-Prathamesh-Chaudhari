

public class Q5 {
    public static void main(String []args){

        int[]arr={1,3,5,8,9};
int max=arr[0];
int min=arr[0];
        for(int i=0;i<arr.length;i++){
if(min>arr[i]){
    min=arr[i];
}          

if(max<arr[i]){
    max=arr[i];
}
        }
   System.out.println("Highest: "+max);
   System.out.println("Smallest: "+min);


    }
}
