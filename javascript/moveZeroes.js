/*
https://leetcode.com/problems/move-zeroes/ 

*/

//Here we move all non-zeroes to the front.
const moveZeroes = function (nums) {
    let nonZeroPosition = 0; //keep track of last non-zero position. This is required since this will mark the position of last seen non-zero at the front
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== 0) {
            let temp = nums[nonZeroPosition]; //swap current item with last known non-zero position
            nums[nonZeroPosition] = nums[i];
            nums[i] = temp;
            nonZeroPosition++; //increment by 1 since we have swapped to the front and that position is already filled with non zero.
        }
    }
};