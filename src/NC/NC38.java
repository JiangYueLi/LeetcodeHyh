package NC;

import java.util.ArrayList;

public class NC38 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix==null || matrix.length==0) return res;
        int colEnd = matrix[0].length-1,colBegin=0;
        int rowEnd = matrix.length-1 ,rowBegin=0;
        while(rowBegin <= rowEnd && colBegin <= colEnd)
        {
            for(int j = colBegin;j<=colEnd;j++)
            {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            for(int j= rowBegin;j<=rowEnd;j++)
            {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            if (colBegin <= colEnd) {
                // Traverse Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        return res;
    }
}
