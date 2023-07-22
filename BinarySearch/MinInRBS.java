class MinInRBS {
    public static void main(String[] args){
        int[] nums = {15, 10, 11, 12, 13, 14};

        int output = findMin(nums);

        System.out.println(output);
    }

    static int findMin(int[] nums){

        int pivot = findPivot(nums);

        if(pivot == -1){
            return nums[0];
        }

        return nums[pivot+1];
    }

    static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }

            if(start < mid && nums[mid-1]>nums[mid]){
                return mid - 1;
            }

            if(nums[start] < nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
