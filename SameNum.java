import java.util.*;
public class SameNum {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        HashMap<Integer,Boolean> get=new HashMap<>();
        for(int i=0;i<length;i++){
            if(get.containsKey(numbers[i])){
                duplication[0]=numbers[i];
                return true;
            }
            else{
                get.put(numbers[i],true);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={2,1,6,5,4,2,4};
        int[] b={0};
        System.out.println(duplicate(arr,7,b));
    }
}