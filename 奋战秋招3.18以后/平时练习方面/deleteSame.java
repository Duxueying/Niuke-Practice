import java.util.Scanner;
public class deleteSame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        int len=str1.length();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<len;i++){
            if(str2.indexOf(str1.charAt(i))==-1){//������str2�ж�û��str1���Ǹ�Ԫ�أ�û�ҵ�����-1
                sb.append(str1.charAt(i));//����append���
            }
        }
        System.out.println(sb.toString());//���ַ�����ʽ���
    }
}
