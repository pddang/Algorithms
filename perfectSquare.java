class perfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        long i = 1, temp = 1;
        while(temp <= num){
            i++;
            temp =  i * i ;
        }
        int res = (int)i - 1;
        return res * res == num ? true: false;
    }
}