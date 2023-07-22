class splitArrLargestSum {
    public int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;

        for(int i=0; i<=arr.length-1; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        if(m==1){
            return end;
        }

        while(start < end){
            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1;

            for(int num: arr){
                if(sum + num > mid){ //splitting array when sum is greater than mid
                    sum = num;
                    pieces++;
                }else{
                    sum+= num;
                }
            }

            if(pieces>m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
