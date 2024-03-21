public class Q6 {
    public static void main(String[] args) {
        int []arr={24,54,31,16,82,45,67};
int max1 = arr[0];
int max2=arr[0];
int max3=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]);
            max1=arr[i];
        }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max2 && max1>arr[i]);
        max3=arr[i];
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max3 && max2>arr[i]);
        max3=arr[i];
    }

System.out.println("The third highest number: "+max3);


    }
}
