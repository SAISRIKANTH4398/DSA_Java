class SqrRt {
    public static void main(String[] args){
        int x = 8;
        System.out.println(mysqrt(x));
    }

    static int mysqrt(int x){
        int start = 1;
        int end = x/2;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid == x/mid){
                return mid;
            }
            if(mid < x/mid){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
}
