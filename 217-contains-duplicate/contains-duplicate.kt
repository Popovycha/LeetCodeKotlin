class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        //Prioritize Time
        val set = HashSet<Int>()
    
        for(i in nums.indices) {
            if (set.contains(nums[i])) return true
            set.add(nums[i])
        }
        //Prioritize Space
        // nums.sort()
        // for ( i in 0  until nums.size - 1) {
        //     if( nums[i] == nums[i + 1]) return true
        // }

    return false
    }
}