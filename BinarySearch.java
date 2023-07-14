class BinarySearch{
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,11,14,17,23,28,36,45,52};
        int target = 54;
        int result = getIndex(arr, target);
        System.out.println(result);
    }

    static int getIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){

                end = mid - 1; //

            }else if(target > arr[mid]){

                start = mid + 1;

            }else{

                return mid;
            }
        }
        return -1;
    }
}