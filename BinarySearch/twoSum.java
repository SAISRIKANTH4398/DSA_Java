import java.util.Arrays;

class TwoSum {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 13};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target){
        int[] arr = {0, 0};

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            if(nums[start]+nums[end] == target){
                arr[0] = start; arr[1] = end;
                return arr;
            }else if(nums[start]+nums[end] > target){
                end--;
            }else{
                start++;
            }
        }

        return arr;
    }
}
