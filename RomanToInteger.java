import java.util.HashMap;

class RomanToInteger {
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int total = 0;
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i = 0; i < s.length()-1; i++){
            int currentInt = map.get(s.charAt(i));      
                if( map.get(s.charAt(i+1)) > currentInt){
                    total -= currentInt;
                } else {
                    total += currentInt;
                }
            } 
        total += map.get(s.charAt(s.length()-1));
         return total; 
    }


}