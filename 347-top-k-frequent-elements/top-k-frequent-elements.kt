class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = HashMap<Int, Int>()

        for(num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }

        var pairs = mutableListOf<Pair<Int, Int>>()
        for ((num, freq) in count) {
            pairs.add(Pair(freq,num))
        }
        pairs.sortByDescending { it.first }

        val res = IntArray(k)
        for(i in 0 until k) {
            res[i] = pairs[i].second
        }
        return res
    }
}