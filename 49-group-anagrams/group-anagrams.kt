class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<List<Int>, MutableList<String>>()

        for (s in strs) {
            val count = MutableList(26) { 0 }
            for (c in s) {
                count[c - 'a']++
            }
            map.getOrPut(count) { mutableListOf() }.add(s)
        }

        return map.values.toList()
    }
}