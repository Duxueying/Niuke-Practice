import java.util.Scanner;
/* 逆序：I am a boy输出boy a am I*/
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ch = input.nextLine().split(" ");//字符串数组，用split分开
        String s = " ";
        for (int i = ch.length - 1; i >=0; i--) {
            s = s + ch[i] + " ";
        }
        System.out.println(s);
    }
}
