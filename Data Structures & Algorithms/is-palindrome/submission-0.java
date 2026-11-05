class Solution {
    public boolean isPalindrome(String s) {
         int l = 0, r = s.length() - 1;

        while (l < r) {
            // skip non-alphanumeric from the left
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            // skip non-alphanumeric from the right
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;

            // compare case-insensitively
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;       
             r--;
        }
        return true;
    }
}
