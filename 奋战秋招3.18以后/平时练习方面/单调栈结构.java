import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 单调栈结构{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] data = new int[n];
            for (int i = 0; i < data.length; i++) {
                data[i] = sc.nextInt();
            }
            int[][] result = getMin(data);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i][0]).append(" ").append(result[i][1]).append('\n');
            }
            System.out.print(sb);
        }
    }

    public static int[][] getMin(int[] arr){
        int[][] res = new int[arr.length][2];
        for(int i = 0; i< arr.length;i++){
            int cur = i - 1;
            while(cur >= 0){
                if(arr[cur] < arr[i]){
                    res[i][0] = cur;
                    break;
                }
                cur--;
            }
            if(cur < 0) res[i][0] = -1;
            cur = i + 1;
            while(cur < arr.length){
                if(arr[cur] < arr[i]){
                    res[i][1] = cur;
                    break;
                }
                cur++;
            }
            if(cur == arr.length) {
                res[i][1] = -1;
            }
        }
        return res;
    }
}

