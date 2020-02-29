
import java.util.Scanner;
    public class Test2
    {
        public static void main(String[] args) throws Exception
        {
            Scanner input=new Scanner(System.in);
            String str = input.nextLine();
            int n = Integer.parseInt(str);
            int count = 0;
            for(int i = 1; i <= n ; i++)
            {
                count +=i;
                if (count >= n)
                {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
