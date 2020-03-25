import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=" ";
        while((line=input.nextLine())!=null){
            String[] x=line.split("_");//字符串数组用—分割开
            StringBuffer sb=new StringBuffer();
            sb.append(x[0]);
            for(int i=1;i<x.length;i++){
                sb.append(Character.toUpperCase(x[i].charAt(0)));
                sb.append(x[i].substring(1));
            }
            System.out.println(sb.toString());
        }
    }
}
