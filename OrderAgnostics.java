
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

            if(arr[mid] < target){
                end = mid - 1;
            }else if(arr[mid] > target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
