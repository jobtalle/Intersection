import java.util.Vector;

public class Intersection {
    static int[] intersection(int arr0[], int arr1[])
    {
        Vector<Integer> result = new Vector<>();
        int i0 = 0;
        int i1 = 0;

        for(;;) {
            if(arr0[i0] == arr1[i1]) {
                result.add(arr0[i0]);

                if(++i0 == arr0.length)
                    break;

                if(++i1 == arr1.length)
                    break;
            }
            else if(arr0[i0] < arr1[i1]) {
                if (++i0 == arr0.length)
                    break;
            }
            else {
                if (++i1 == arr1.length)
                    break;
            }
        }

        int resultArray[] = new int[result.size()];
        for(int i = 0; i < result.size(); ++i)
            resultArray[i] = result.get(i);

        return resultArray;
    }
}
