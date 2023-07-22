public class SearchInMountainArr {
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 5,3,2};
        int target = 5;

        System.out.println(search(arr, target));
    }
        static int search(int[] arr, int target){
             //[4, 5, 6, 7, 0, 1, 2]
     
             int peak = peakValue(arr);
             int firstTry = BinarySearch(arr, target, 0, peak);
     
             if(firstTry != -1){
                 return firstTry;
             }
     
             return BinarySearch(arr, target, peak+1, arr.length - 1);
         }
     
         static int peakValue(int[] arr){
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
     
         static int BinarySearch(int[] arr, int target, int start, int end){
     
             boolean isAsc = arr[start] < arr[end];
     
     
             while(start <= end){
                 int mid = start + (end - start)/2;
     
                 if(arr[mid] == target){
                     return mid;
                 }
     
                 if(isAsc){
                     if(target < arr[mid]){
                         end = mid-1;
                     }else{
                         start = mid + 1;
                     }
                 }else{
                     if(target > arr[mid]){
                         end = mid - 1;
                     }else{
                         start = mid + 1;
                     }
                 }
                 
             }
             return -1;
         }
     }
