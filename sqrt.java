class sqrt {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(mySqrt(num));
    }
// Babylonian method  

    public static int mySqrt(int x){
        long i = 1; long res = 1;
        while(res <= x){
            i++;
            res = i * i;
        }
        return (int)i - 1;
    }
}