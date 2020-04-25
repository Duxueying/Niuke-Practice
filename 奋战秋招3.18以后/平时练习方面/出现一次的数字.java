import java.util.Scanner;
public class 出现一次的数字{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] arr=new int[num];
        int result=0;
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
            result=result^arr[i];
        }

        // temp=A^B; && temp!=0
        int temp=result&(~result+1);
        int a=result;
        for(int i=0;i<num;i++){
            if((arr[i]&temp)!=0){
                a^=arr[i];
            }
        }
        int b=result^a;

        if(a<b){
            System.out.println(a+" "+b);
        }else{
            System.out.println(b+" "+a);
        }
    }
}
