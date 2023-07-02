/*
https://leetcode.com/problems/counting-bits/
 */

//Solution 1 : O(n log n)
const countSetBits = function (n) {
    let count = 0;
    while (n) {
        count = count + (n & 1); //check LSB is set or not using bitwise operator with 1
        n = n >> 1; //shift to the right to check the next LSB
    }
    return count;
}

//Solution 2 : O(n)
const countSetBits2 = function (n) {
    let count = 0;
    for (let i = 0; i <= 31; i++) { //because in the question it is given that 0 <= n <= 10^5 , so n can be represented under 32 bits
        if (n & (1 << i))
            count++;
    }
    return count;
}