class Solution {
    public String mergeAlternately(String word1, String word2) {
       int left = 0;
       int right = 0;
       String s = "";

       while(left<word1.length() && right<word2.length()){

        s = s + word1.charAt(left) + word2.charAt(right);
        left++;
        right++;


       } 

       while(left < word1.length()){
        s = s+ word1.charAt(left);
        left++;
       }
         while(right < word2.length()){
        s = s+ word2.charAt(right);
        right++;
       }

       return s;

    }
}