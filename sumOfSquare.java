class sumOfSquare {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(judgeSquareSum(num));
    }
    public static boolean judgeSquareSum(int c) {
        //idea: left = 0; right starts with sqrt of c
        //if result < c, increment ;eft; else decrement right;

        //or increment both of them up until it reaches the result like below 
        
        for(int i = 0; i <= c; i++){
            for(int j = 0; j <= c; j++ ){
                if(i*i +j*j == c) return true;
            }
        }
        return false;

    }
}