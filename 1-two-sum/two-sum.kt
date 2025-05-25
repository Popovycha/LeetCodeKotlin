class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { i, num ->
        val complement = target - num
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[num] = i
    }
    return intArrayOf()
    }
}

        // for (i in nums.indices) {
        //     for(j in i + 1 until nums.size) {
        //         if(nums[i] + nums[j] == target) return intArrayOf(i,j)
        //     }
        // }
        // return intArrayOf()