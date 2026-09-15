class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      int l=0,r=s.length()-1;
      while(l<r){
        if(!Character.isLetterOrDigit(s.charAt(l))){
            l++;
            continue;
        } 
        else if(!Character.isLetterOrDigit(s.charAt(r))){
            r--;
            continue;
        }
        if(s.charAt(l)==s.charAt(r)){
           
            l++;
            r--;
        }
        else{
            return false;
        }
      }
      return true;

    }
}
