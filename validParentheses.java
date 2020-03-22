import java.util.Stack;

class validParentheses {
    public static void main(String[] args) {
        
        String str = "()[]{}";
        System.out.println("Valid: " + isValid(str));
    }


    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
                //System.out.println(stack.peek());
            } else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                if(stack.empty() || !arePair(stack.peek(), s.charAt(i)) ) {
                    return false;         
            } else {
                stack.pop();
            }}
        }
        return stack.isEmpty()? true: false;
    }
    public static boolean arePair(char opening, char closing){
        if (opening == '(' && closing==')') return true;
        else if (opening == '[' && closing==']') return true;
        else if (opening == '{' && closing=='}') return true;
        else return false;
    }






}