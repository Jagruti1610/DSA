/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    const map = {}
    let count = 0

    for (const number of nums) {

        if (map[number]) {   // if this is undefined -- means the key does not already exists
            // it will go to the else section
            count += map[number];
            map[number] += 1; 
            // Keep track of how many instances of the number you've seen, because any time you see it              again, you know it'll pair up with all the ones you've seen before.
        } else {
            map[number] = 1;  // stores a new number for thi first time
        }
        // console.log(count)
        // console.log(map)
    }
    return count
};

// https://leetcode.com/problems/number-of-good-pairs/
// https://leetcode.com/problems/number-of-good-pairs/discuss/911686/Clean-JavaScript-Solution
