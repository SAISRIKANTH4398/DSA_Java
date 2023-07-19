class searchIn2DArr {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4},
            {6, 8, 13, 16},
            {19, 22, 31, 45},
            {51, 63, 71, 77}
        };

        System.out.println(search(arr, 32));
    }

    static boolean search(int[][] arr, int target){

        int row = 0;
        int col = arr[row].length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return true;
            }

            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
