import java.util.Scanner;
public class deleteSame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        int len=str1.length();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<len;i++){
            if(str2.indexOf(str1.charAt(i))==-1){//遍历完str2中都没有str1的那个元素，没找到返回-1
                sb.append(str1.charAt(i));//就用append添加
            }
        }
        System.out.println(sb.toString());//以字符串形式输出
    }
}
