import java.util.Scanner;
public class ugly {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s =input.next();
        StringBuilder sb=new StringBuilder(s);
        int index=0;
        while(index<sb.length()&&sb.charAt(index)=='?'){
            index++;
        }
        for(int i=index+1;i<sb.length();i++){
            if(sb.charAt(i)=='?'){
                if(sb.charAt(i-1)=='A'){
                    sb.replace(i,i+1,"B");
                }
                else{
                    sb.replace(i,i+1,"A");
                }
            }

        }
        System.out.println(count(sb.toString(),index));
    }
    public static int count(String str,int index){
        int count=0;
        for(int i=index+1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}
