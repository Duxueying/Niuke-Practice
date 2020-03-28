
import java.util.ArrayList;
import java.util.Arrays;
public class small {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return " ";
        }
        Arrays.sort(numbers);
        String str = String.valueOf(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            str = compareAndAdd(str, String.valueOf(numbers[i]));
        }
        return str;
    }
    public  String compareAndAdd(String str1, String str2){
        String strA = str1 + str2;
        String strB = str2 + str1;
        return strA.compareTo(strB) > 0 ? strB : strA;
    }

}