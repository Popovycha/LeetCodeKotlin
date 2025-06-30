class Solution {
    //Time Complexity: 0(n)
    //Space Complexity: O(m)
    fun lengthOfLongestSubstring(s: String): Int {
        val set = HashSet<Char>()
        var left = 0
        var max = 0

        for (right in s.indices) {
            while (s[right] in set) {
                set.remove(s[left])
                left++
            }
            set.add(s[right])
            max = maxOf(max, right - left + 1)
        }
        return max
    }
}