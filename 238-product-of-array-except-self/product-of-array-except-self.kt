class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val answer = IntArray(nums.size) { 1 }
        
        var prefix = 1
        for (i in nums.indices) {
            answer[i] = prefix
            prefix *= nums[i]
        }
        
        var suffix = 1
        for (i in nums.indices.reversed()) {
            answer[i] *= suffix
            suffix *= nums[i]
        }
        return answer  
    }
}