class Main {
    public static void main(String[] args) {
      String str = "2,10";
      System.out.println(numPrime(str));
      
    }
    
    public static int numPrime(String line){
      //Split String by comma and convert it to integer
      String[] strArr = line.split(",");
      int[] intArr = new int[strArr.length];
      for(int i = 0; i < intArr.length; i++){
        intArr[i] = Integer.parseInt(strArr[i]);
      }
      //check prime number
      int count = 0;
      int low = intArr[0];
      int high = intArr[intArr.length -1];
      while(low < high){
        boolean flag = false; 
        for(int i = 2; i <= low/2; ++i){
          if(low%i == 0){
            flag = true;
            break;
          }
        }
       if(!flag) count++;
       ++low;
      }
    return count; 
    }
  }
  