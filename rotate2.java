public class rotate {
    public static void rotate(int[] nums, int k) {
        StringBuffer sb=new StringBuffer("");
        String str1 = "",str2="";
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - k) {
                str1 += String.valueOf(nums[i]);//整型数组转为字符串
            }
            else
            {
                str2+=String.valueOf(nums[i]);
            }
        }
        sb.append(str2).append(str1);
        String str=sb.toString();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9,9};
        rotate(arr,3);
    }
}

