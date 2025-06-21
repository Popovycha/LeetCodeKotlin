class MinStack() {
    //Time Complexity: O(1)
    //Space Complexity: O(n)
    var stack = ArrayDeque<Int>()
    var minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.addLast(`val`)
        val minVal = if (minStack.isNotEmpty()) minOf(`val`, minStack.last()) else `val`
        minStack.addLast(minVal)
    }

    fun pop() {
        stack.removeLast()
        minStack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */