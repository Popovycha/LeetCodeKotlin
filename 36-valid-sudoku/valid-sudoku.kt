class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val row = Array(9) { HashSet<Char>() }
        val col = Array(9) { HashSet<Char>() }
        val square = Array(9) { HashSet<Char>() }

        for (r in 0 until 9) {
            for (c in 0 until 9) {
                val value = board[r][c]
                if(value == '.') continue

                val squareIdx = (r / 3) * 3 + (c / 3)
                if(value in row[r] || value in col[c] || value in square[squareIdx]) {
                    return false
                }
                row[r].add(value)
                col[c].add(value)
                square[squareIdx].add(value)
            }
        }
        return true
    }
}