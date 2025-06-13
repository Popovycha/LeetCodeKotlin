class Solution {
//Time complexity: O(n)
//Space complexity: O(n)
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var longest = 0

        for(num in set) {
            if((num - 1) !in set) {
                var length = 1

                while((num + length) in set) {
                    length++
                }
                longest = maxOf(longest, length)
            }
        }
        return longest
    }
}