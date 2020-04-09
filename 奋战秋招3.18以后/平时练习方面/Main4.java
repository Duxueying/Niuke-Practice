import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];
        int count=0;
        if(n<=0){
            System.out.println("ÊäÈë´íÎó");
        }
        for(int i=0;i<n;i++){
            A[i]=input.nextInt();
            B[i]=input.nextInt();
            if(A[i]<B[i]){
                count++;
            }
        }
       System.out.println(count);
    }
}
