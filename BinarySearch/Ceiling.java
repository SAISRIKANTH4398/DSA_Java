public class Ceiling {
    public static void main(String[] args){
        int[] arr = {2, 4, 23, 36, 61, 73, 89, 107, 121};
        int target = 45;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid - 1;
            }else{
                return mid;
            }

        }
        return start;
    }
}
