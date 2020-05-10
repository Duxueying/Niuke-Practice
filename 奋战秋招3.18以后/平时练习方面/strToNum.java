public class strToNum {
    public int StrToInt(String str) {
        if(str.length()==0)
            return 0;
        int num=0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)>='0'&&str.charAt(i)<='9'||str.charAt(0)=='-'||str.charAt(0)=='+')
            {
                if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                    num=num*10+(int) str.charAt(i)-'0';
            }
            else{
                return 0;
            }
        }
        if(str.charAt(0)=='-')
            return -num;
        else{
            return num;
        }
    }
}