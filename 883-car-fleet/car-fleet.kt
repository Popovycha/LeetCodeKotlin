class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        //Space Complexity: O(n log n)
        //Time Complexist: O(n)
        val pair = position.zip(speed).sortedByDescending { it.first}
        val stack = mutableListOf<Double>()

        for((p, s) in pair) {
            val time = (target - p ).toDouble() / s
            stack.add(time)
            //if at least two cars and if top of stack reaches before the one ahead of it
            if(stack.size >= 2 && stack[stack.size - 1] <= stack[stack.size - 2]) {
                stack.removeAt(stack.size - 1)
            }
        }
        return stack.size
    }
}