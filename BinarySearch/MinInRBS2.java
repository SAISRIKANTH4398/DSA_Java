class MinInRBS2 {
    public static void main(String[] args){
        int[] nums = {1, 1, 3, 1};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums){

        int pivot = findPivot(nums);

        if(pivot == -1){
            return nums[0];
        }

        return nums[pivot+1];
    }

    static int findPivot(int[] nums){

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                if(start < mid && nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                if(end > mid && nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
