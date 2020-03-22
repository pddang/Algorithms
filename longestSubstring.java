class longestSubstring {
    public static void main(String[] args) {
        String[] strs = { "flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
    int max = strs[0].length();
    if(strs.length == 0) return "";
    if(strs.length == 1) return strs[0];
    
    //search for maxinum size
    for(int i = 1; i < strs.length; i++){
        
        if(strs[i].length() < max){
            max = strs[i].length();
        }
    }

    //search for common characters in two strings 
    int common = 0;
    for(int i = 0; i< max;i++ ){
        if(strs[0].charAt(i) == strs[1].charAt(i)){
            common++;
        } else{
            break;
        }
    }

    //search common characters to the rest 
    
    
    for(int i = 1; i < strs.length && common>0;i++){
        for(int j = 0; j < common;j++){
            if(strs[i].charAt(j) != strs[i-1].charAt(j)) {
                common = j; 
                break; 
            }
        }
    }
   return strs[0].substring(0, common);
    }

}