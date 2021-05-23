package NC;

public class NC61 {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        for(int i = 0;i<numbers.length;i++)
        {
            for(int j =i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j] == target)
                {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }
}
