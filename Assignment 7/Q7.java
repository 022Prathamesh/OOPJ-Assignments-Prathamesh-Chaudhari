public class Q7 {
    public static void main(String[] args) {
        int[] arr1 = {23, 60, 94, 3, 102};
        int[] arr2 = {42, 16, 74};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.print("Merged Array: [");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]);
            if (i < mergedArray.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j])
                mergedArray[k++] = arr1[i++];
            else
                mergedArray[k++] = arr2[j++];
        }

        while (i < arr1.length)
            mergedArray[k++] = arr1[i++];

        while (j < arr2.length)
            mergedArray[k++] = arr2[j++];

        return mergedArray;
    }
}
