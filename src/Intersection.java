import java.util.Vector;

public class Intersection {
    static int[] intersection(int arr0[], int arr1[])
    {
        Vector<Integer> result = new Vector<>();
        int i0 = 0;
        int i1 = 0;

        while(i0 < arr0.length && i1 < arr1.length) {
            if(arr0[i0] == arr1[i1]) {
                result.add(arr0[i0]);

                ++i0;
                ++i1;
            }
            else if(arr0[i0] < arr1[i1])
                ++i0;
            else
                ++i1;
        }

        int resultArray[] = new int[result.size()];
        for(int i = 0; i < result.size(); ++i)
            resultArray[i] = result.get(i);

        return resultArray;
    }
}
