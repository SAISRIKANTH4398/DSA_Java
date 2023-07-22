class Floor {
    public static void main(String[] args){
        int[] arr = {3, 6, 8, 21, 37, 48, 59, 63, 71, 85};
        int target = 45;

        int ans = flooring(arr, target);
        System.out.println(ans);
    }

    static int flooring(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return end;
    }
}
