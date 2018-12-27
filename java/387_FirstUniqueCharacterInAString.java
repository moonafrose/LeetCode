/*
https://leetcode.com/problems/first-unique-character-in-a-string/

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.

*/
class Solution {
    public int firstUniqChar(String s) {
        /*
         * We'll create a frequency map which will store frequency of characters.
         * Finally we'll iterate through the string and return first entry with freq=1
         */
        if (s == null || s.length() <= 0) {
            return -1;
        }
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}