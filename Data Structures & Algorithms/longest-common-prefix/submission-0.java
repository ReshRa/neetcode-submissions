class Solution {
    public String longestCommonPrefix(String[] strs) {
                if (strs == null || strs.length == 0) {
            return "";
        }

        // Loop through each character index 'i' of the first string (strs[0])
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            // Compare character at index 'i' across all remaining strings
            for (int j = 1; j < strs.length; j++) {
                // Stop if string 'j' is shorter than index 'i' OR characters mismatch
                if (i == strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // If no mismatch was found, the entire first string is the common prefix
        return strs[0];
    }
}