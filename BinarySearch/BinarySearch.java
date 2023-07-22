/*Binary Search: This algorithm is used to find an element in a sorted array, 
if it has large num of elements.
This search basically cuts off half of the elements based on target element. Hence it is more time efficient. */ 
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

            if(target < arr[mid]){ //If target is less than mid element, array shifts to left of mid .

                end = mid - 1; //

            }else if(target > arr[mid]){  //If target is greater than mid element, array shifts to right of mid .

                start = mid + 1;

            }else{

                return mid; //If target = mid element, returns mid
            }
        }
        return -1;  //If target is not found, returns -1
    }
}