public class Solution {
    public String LeftRotateString(String str,int n) {
        int l = str.length();
        String res = str+str;
        String s = "";
        for(int i = 0;i < res.length();i++){
            if(i >= n && i< l+n)
                s += res.charAt(i);
        }
        return s;
    }
}