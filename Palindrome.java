public class Palindrome {
    public static void main(String[] args) {
       int num = 121;
       boolean x = isPalindrome(num);
       System.out.println(x);

    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder strbld = new StringBuilder();
        strbld.append(str);
        if(str.equals(strbld.reverse().toString())) return true;
        return false;
        
    }



}