package JZ;

public class JZ1 {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0) return false;
        int col = array.length-1;
        int low = 0;

        while(col>=0&& low<=array[0].length-1)
        {
            if(target == array[low][col])
            {
                return true;
            }
            else if (target > array[low][col])
            {
                low++;
            }
            else if (target < array[low][col])
            {
                col--;
            }
        }
        return false;
    }
}
