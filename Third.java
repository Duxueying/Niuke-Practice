public class Third {
        public static int thirdMax(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }
            if(nums.length==2){
                return Math.max(nums[0],nums[1]);
            }
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            int max3=Integer.MIN_VALUE;
            boolean f=true;
            int flag=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==Integer.MIN_VALUE&&f){
                    flag++;
                    f=false;
                }
                if(nums[i]>max1){
                    flag++;
                    //原先第二大传递给第三大
                    max3=max2;
                    //原先最大值传递给第二大
                    max2=max1;
                    //更新最大值
                    max1=nums[i];
                }else if (nums[i]>max2 && nums[i]<max1){
                    flag++;
                    max3=max2;
                    max2=nums[i];
                } else if( nums[i]>max3 && nums[i]<max2){
                    flag++;
                    max3=nums[i];
                }
            }
            return flag>=3?max3:max1;
        }

    public static void main(String[] args) {
            int []arr={1,5,6,3,7,8,2,8};
            System.out.println(thirdMax(arr));
    }
}
