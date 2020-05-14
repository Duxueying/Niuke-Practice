import java.lang.String;
public class day11_26 {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] answer= new boolean[n];
        for(int i=0;i<n;i++){
            if(s.contains(p[i])){
                answer[i]=true;
            }else{
                answer[i]=false;
            }
        }
        return answer;
    }
}