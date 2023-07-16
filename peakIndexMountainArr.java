public class peakIndexMountainArr {
    public static void main(String[] args){
        int[] arr = {2, 5, 7, 9, 8, 5, 3};

        int ans = peakIndexMountainarr(arr);
        System.out.println(ans);
    }

    static int peakIndexMountainarr(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
