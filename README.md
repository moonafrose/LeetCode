# LeetCode
Solutions to problems on LeetCode

| Title | Solution | Basic idea to approach |
|-------|----------|------------------------|
 [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](https://github.com/moonafrose/LeetCode/blob/master/java/1_TwoSum.java)| Use map to check if target sum already exists |
 [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)| [Java](https://github.com/moonafrose/LeetCode/blob/master/java/3_LongestSubstringWithoutRepeatingCharacters.java)|Two pointer approach(sliding window) that will hold only unique characters| 
[ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/)| [Java](https://github.com/moonafrose/LeetCode/blob/master/java/6_ZigZagConversion.java)|Create an array of strings, each one will represent the characters that would appear at each row. Finally merge all characters at each row|
[Container With Most Water](https://leetcode.com/problems/container-with-most-water/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/11_ContainerWithMostWater.java)| Two pointer approach to calculate the volume between two heights|
[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/20_ValidParentheses.java)| Use stack to keep track of opening and closing braces|
[Count and Say](https://leetcode.com/problems/count-and-say/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/38_CountAndSay.java)| Keep on building next sequence using given sequence and so on, using recursion|
[Group Anagrams](https://leetcode.com/problems/group-anagrams/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/49_GroupAnagrams.java)| Sort each string and use this as key to check for other similar strings|
[Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/54_SpiralMatrix.java)| Use enum to decide which direction to go, and ignore already seen row/column|
[LRU Cache](https://leetcode.com/problems/lru-cache/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/146_LRUCache.java)|doubly linked list and map, since map will provide O(1) get and put, and removing nodes from end of linked list and moving to head is also O(1)|
[Min Stack](https://leetcode.com/problems/min-stack/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/155_MinStack.java)|Two stacks, inputStack and minStack. At any given point of time, minStack will hold minimum element till now(pushed or popped value)| 
[Find Peak Element](https://leetcode.com/problems/find-peak-element/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/162_PeakElement.java)|Either Linear search which meets condition, or binary search since a solution will always exist|
[Count Primes](https://leetcode.com/problems/count-primes/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/204_CountPrimes.java)|Sieve of eratosthenes since other methods gives TLE for large inputs|
[Power of Two](https://leetcode.com/problems/power-of-two/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/231_PowerOfTwo.java)|Bitwise solution since power of two contains only 1 set bit|
[Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/328_OddEvenLinkedList.java)|Two pointers, one for odd and other for even. Link alternate odds and evens, finally merge them together|
[Power of Four](https://leetcode.com/problems/power-of-four/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/342_PowerOfFour.java)|Recursively check using division and modulo, or use bitwise solution|
[First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)|[Java](https://github.com/moonafrose/LeetCode/blob/master/java/387_FirstUniqueCharacterInAString.java)|Use map to keep track of frequency|
