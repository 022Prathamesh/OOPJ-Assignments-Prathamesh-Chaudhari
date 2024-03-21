public class Q8 {
    public static void main(String[] args) {
        int[] array = {5, 14, 35, 89, 140};
        
        Average(array);
    }

    public static void Average(int[] array) {
        if (array.length < 3) {
            return;
        }

        for (int i = 0; i <= array.length - 3; i++) {
            int average = (array[i] + array[i+1] + array[i+2]) / 3;
            System.out.print(average);
            if (i < array.length - 3) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
