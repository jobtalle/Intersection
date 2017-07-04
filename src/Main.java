import java.util.Arrays;

public class Main {
    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);

            if (i != arr.length - 1)
                System.out.print(", ");
        }

        System.out.println();
    }

    private static boolean isInArray(int arr[], final int integer)
    {
        for (int n : arr)
            if (n == integer)
                return true;

        return false;
    }

    public static void main(String args[])
    {
        final int iMax = 40;
        final int arraySize0 = 20;
        final int arraySize1 = 15;
        int arr0[] = new int[arraySize0];
        int arr1[] = new int[arraySize1];

        // Fill arrays with unique random numbers
        for(int i = 0; i < arraySize0; ++i) {
            int n = (int)(Math.random() * iMax);

            while(isInArray(arr0, n))
                n = (int)(Math.random() * iMax);

            arr0[i] = n;
        }

        for(int i = 0; i < arraySize1; ++i) {
            int n = (int)(Math.random() * iMax);

            while(isInArray(arr1, n))
                n = (int)(Math.random() * iMax);

            arr1[i] = n;
        }

        // Sort arrays
        Arrays.sort(arr0);
        Arrays.sort(arr1);

        // Print them
        printArray(arr0);
        printArray(arr1);
        printArray(Intersection.intersection(arr0, arr1));
    }
}
