package LeetCode;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {49,95,124,5215,55,332,12};
        quickSort(arr,0,arr.length-1);
        for(int i :arr)
        {
            System.out.println(i);
        }
    }
    private static void quickSort(int []arr ,int low ,int high)
    {
        if(low <high)
        {
            int index = getIndex(arr,low,high);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);
        }
    }
    private static int getIndex(int []arr,int low ,int high)
    {
        int tmp = arr[low];
        while(low <high)
        {
            while(low <high && arr[high]>=tmp)
            {
                high--;
            }
            arr[low] = arr[high];
            while(low<high && arr[low]<=tmp)
            {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = tmp;
        return low;
    }
}
