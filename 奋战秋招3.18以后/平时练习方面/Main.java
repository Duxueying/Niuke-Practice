import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dui=input.nextInt();
        int m=input.nextInt();
        int result=m;
        int temp=0;
        for(int i=0;i<dui;i++){
            temp=input.nextInt();
            if(temp==result){
                result=result*2;
            }
        }
        System.out.println(result);
    }
}
