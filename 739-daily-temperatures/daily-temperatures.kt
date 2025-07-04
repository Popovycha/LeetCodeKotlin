class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        //Time & Space Complexity: O(n)
        val res = IntArray(temperatures.size) { 0 }
        val stack = mutableListOf<Int>() 

        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
                val stackInd = stack.removeAt(stack.size - 1)
                res[stackInd] = i - stackInd
            }
            stack.add(i)
        }
        return res
    }
}