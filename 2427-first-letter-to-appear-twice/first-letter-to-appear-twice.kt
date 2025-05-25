class Solution {
    fun repeatedCharacter(s: String): Char {
        val set = HashSet<Char>()
        for (i in 0..s.length) {
            if(set.contains(s[i])) {
                return s[i]
            }
            set.add(s[i])
        }
        return ' '
    }
}