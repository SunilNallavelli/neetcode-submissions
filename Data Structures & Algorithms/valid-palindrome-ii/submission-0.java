class Solution {
    public boolean validPalindrome(String s) {

         int left =0;
         int right=s.length()-1;

         while(left< right){    
            if(s.charAt(left)!=s.charAt(right)){

                if(ispalidrome(s,left+1,right)){
                    return true;
                }
                if(ispalidrome(s,left,right-1)){
                    return true;
                }
                return false;
            }
            left++;
            right--;
         }
        return true;
    } 

    private boolean ispalidrome(String s,int left, int right){

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
              left++;
               right--;
        }
      return true;
    }
}