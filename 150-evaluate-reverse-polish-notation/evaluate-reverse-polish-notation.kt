class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for (token in tokens) {
            when (token) {
                "+" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b + a)
                }
                "-" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b - a)
                }
                "*" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b * a)
                }
                "/" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b / a)
                }
                else -> stack.addLast(token.toInt())
            }
        }
        return stack.last()
    }
}