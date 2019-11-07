import java.util.Scanner;
public class Main {
          
    public static void main(String[] args) {
          
  
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
              
            int num = sc.nextInt();
            if(num==0) break;
            int left = num;
            int total = 0;
            while(left!=0){
                if(left==2){
                    total+=1;
                    break;
                }else if(left==1){
                    break;
                }else{
                    int curr = left/3;
                    total+=curr;
                    left = left-curr*3+curr;
                }
            }
            System.out.println(total);
        }
    }
      
      
}
