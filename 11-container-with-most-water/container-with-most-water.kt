class Solution {
    //Space Complexity: O(1)
    //Time Complexity: O(n)
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var res = 0

        while (left < right) {
            val area = minOf(height[left], height[right]) * (right - left)
            res = maxOf(res, area)

            if (height[left] <= height[right]) {
                left++
            } else {
                right--
            }
        }
        return res
    }
}