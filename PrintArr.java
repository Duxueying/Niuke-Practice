import java.util.*;

public class PrintArr {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] result = new int[n*n];
        int count = 0;
        for(int i = n-1; i >=0; i--){
            for(int j = 0; j < n-i; j++){
                result[count] = arr[j][i+j];
                count++;
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                result[count] = arr[i+j][j];
                count++;
            }
        }
        return result;
    }
}
