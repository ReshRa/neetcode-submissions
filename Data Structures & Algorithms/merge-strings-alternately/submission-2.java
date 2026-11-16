class Solution {
    public String mergeAlternately(String word1, String word2) {
       int left = 0;
       int right = 0;
     StringBuilder s = new StringBuilder();

       while(left<word1.length() && right<word2.length()){

       s.append(word1.charAt(left));
        s.append(word2.charAt(right));
        left++;
        right++;


       } 

       while(left < word1.length()){
        s.append(word1.charAt(left));
        left++;
       }
         while(right < word2.length()){
          s.append(word2.charAt(right));
        right++;
       }

       return s.toString();

    }
}