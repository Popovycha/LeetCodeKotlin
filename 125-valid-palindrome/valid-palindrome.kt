class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1

        while(start < end) {
            if(start < end && !s[start].isLetterOrDigit()) {
                start++
                continue
            }
            if(start < end && !s[end].isLetterOrDigit()) {
                end--
                continue
            }
            if(s[start].lowercase() != s[end].lowercase()) {
                return false
            }
            start++
            end--
        }
        return true

    }
}