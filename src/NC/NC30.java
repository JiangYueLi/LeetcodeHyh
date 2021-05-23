package NC;

import java.util.Arrays;

public class NC30 {
    public int minNumberdisappered (int[] arr) {
        // write code here
        Arrays.sort(arr);
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<=0){
                continue;
            }
            x = x+1;
            if(arr[i]!= x){
                return x;
            }
        }
        return x+1;
    }
}
