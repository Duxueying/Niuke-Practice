import java.util.*;
public class Test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            int k=in.nextInt();
            String s=in.next();
            System.out.println(pointNewchar(s,k));
        }
        public static String pointNewchar(String s, int k){
            if (s==null || s.equals("") || k<0 || k>=s.length()){
                return "";
            }
            char[] chas=s.toCharArray();
            int uNum=0;
            for (int i=k-1;i>=0;i--){
                if (!isUpper(chas[i])){
                    break;
                }
                uNum++;
            }
            if ((uNum & 1)==1){
                return s.substring(k-1,k+1);
            }
            if (isUpper(chas[k])){
                return s.substring(k,k+2);
            }
            return String.valueOf(chas[k]);
        }
        public static boolean isUpper(char h){
            return (h>='A' && h<='Z');
        }
    }
