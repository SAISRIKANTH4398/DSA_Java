class PerfectSquare {
    public static void main(String[] args){
        System.out.println(perfectSquare(100000001));
    }

    static boolean perfectSquare(int num){

        int start = 0;
        int end = num/2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(num==1)
            return true;

            if(mid == (double)num/mid)
            return true;
            else if(mid<(double)num/mid)
            start = mid + 1;
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
