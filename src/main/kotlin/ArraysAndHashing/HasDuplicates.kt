package ArraysAndHashing

class HasDuplicates {
    fun containsDuplicate(nums: IntArray): Boolean {
        val nonDuplicateNums = HashSet<Int>()
        for (num in nums) {
            if (num in nonDuplicateNums) return true
            nonDuplicateNums.add(num)
        }
        return false
    }
}

fun main() {
    println(HasDuplicates().containsDuplicate(intArrayOf(1, 2, 3, 1)))
}