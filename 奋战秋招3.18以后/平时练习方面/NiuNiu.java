import java.util.Scanner;
/*思路：*/
public class NiuNiu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String s=input.next();
            if(s==null||s.length()==0){ //字符串为0输出0；
                System.out.println(0);
            }
            char c1=s.charAt(0);//定义一个字符
            int count=1;
            for(int i=1;i<s.length();i++){
                char c=s.charAt(i);
                if(c1!=c){
                    count++;
                    c1=c;
                }
            }
            System.out.println(count);
        }
    }
}
