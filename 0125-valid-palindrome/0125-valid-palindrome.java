class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String v ="";
        for(int i=s.length()-1; i >=0; i--){
            v+=s.charAt(i);

        }
        if(v.equals(s)){
            System.out.println("is a palindrome");
            return true;

        }
        else{
                System.out.println("not palidrome");
                return false;
                
            }

       
        
    }
    
}