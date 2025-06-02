class Solution {
    //Time Complexity: O(N^2)
    //Space Complexity: O(N) in worst case
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()

        for (i in nums.indices) {
            val a = nums[i]
            //if first number is positive, cannot have triplet
            if(a > 0) break
            //prevention of dublicates
            if(i > 0 && a == nums[i - 1]) continue

            var start = i + 1
            var end = nums.size - 1
            
            while(start < end) {
                val target = a + nums[start] + nums[end]
                when {
                    target < 0 -> start++
                    target > 0 -> end--
                    else -> {
                        result.add(listOf(a, nums[start], nums[end]))
                        //move to look for new combinations
                        start++
                        end--
                        //dublicate handling
                        while (start < end && nums[start] == nums[start - 1]) {
                            start++
                        }
                    }
                }
            }
        }
        return result
    }
}