public class Q10 {
    public static void main(String[] args) {
        int[] array1 = {5, 14, 35, 90, 139};
        int[] array2 = {88, 67, 35, 14, -12};
        int[] array3 = {65, 14, 129, 34, 7};

        checkOrder(array1);
        checkOrder(array2);
        checkOrder(array3);
    }

    public static void checkOrder(int[] array) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                ascending = false;
            }
            if (array[i] > array[i - 1]) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("Ascending");
        } else if (descending) {
            System.out.println("Descending");
        } else {
            System.out.println("Random");
        }
    }
}
