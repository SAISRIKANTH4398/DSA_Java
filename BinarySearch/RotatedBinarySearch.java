class RotatedBinarySearch {
    public static void main(String[] args){
        int[] nums = {3, 4, 5, 6, 0, 1, 2};
        int target = 5;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }else{
            return binarySearch(nums, target, pivot, nums.length - 1);
        }
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return mid;
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

            if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }

            if(nums[start] < nums[mid]){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }
}
