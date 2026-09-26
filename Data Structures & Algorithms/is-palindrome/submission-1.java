
class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        String temp="";
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(Character.isLetterOrDigit(ch)){
                temp= temp +Character.toLowerCase(ch);
            }
        }
        
       for(int i=temp.length()-1;i>=0;i--){
           rev=rev+temp.charAt(i);
       }
       return rev.equals(temp);    
    }
}
