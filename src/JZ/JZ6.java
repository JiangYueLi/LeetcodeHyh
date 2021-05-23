package JZ;

public class JZ6 {
    public int minNumberInRotateArray(int [] array) {

        if(array == null||array.length==0) return 0;
        int high = array.length -1;
        int low = 0;
        while (low <high)
        {
            int mid = low + (high-low)/2;
            if(array[mid]>array[high])
            {
                low = mid+1;
            }
            else if (array[mid] == array[high])
            {
                high = high-1;
            }
            else if (array[mid] <array[high])
            {
                high = mid;
            }
        }
        return array[low];
    }
}
