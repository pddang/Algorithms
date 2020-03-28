

class plusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        int[] newDigits = plusOne(digits);
        for(int digit: newDigits){
            System.out.println(digit);
        }
        
    }

     static int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;

            }
        }
        
        int [] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;

        

    }

}