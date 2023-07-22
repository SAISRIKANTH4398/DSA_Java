// Order Agnostic method: An Array is sorted in Descending order.
public class OrderAgnostics {
    public static void main(String[] args){
        int[] arr = {98, 88, 76, 68, 55, 42, 38, 21, 17, 8, 9};
        int target = 38;

        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] < target){ //If target is less than mid, array shifts to left side.
                end = mid - 1;
            }else if(arr[mid] > target){ //If target is greater than the mid, array shifts to right side.
                start = mid + 1;
            }else{
                return mid; //If target = mid, returns the index of target value.
            }
        }
        return -1; //If target is not in arr, returns -1.
    }
}
