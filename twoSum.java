import java.util.HashMap;
import java.util.Map;
public class twoSum {
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i<nums.length;i++){
                map.put(nums[i],i);
            }
            for(int i = 0;i<nums.length;i++){
                int tmp = target - nums[i];
                if(map.containsKey(tmp) && map.get(tmp) != i){
                    return new int[]{i,map.get(tmp)};
                }
            }
            throw new RuntimeException("No two sum solution");
        }
    public static void main(String[] args) {
      int[] arr={2,4,1,5,6};
      System.out.println(twoSum(arr,6));
    }
}
