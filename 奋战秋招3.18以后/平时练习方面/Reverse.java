import java.util.Scanner;
/* ����I am a boy���boy a am I*/
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ch = input.nextLine().split(" ");//�ַ������飬��split�ֿ�
        String s = " ";
        for (int i = ch.length - 1; i >=0; i--) {
            s = s + ch[i] + " ";
        }
        System.out.println(s);
    }
}
