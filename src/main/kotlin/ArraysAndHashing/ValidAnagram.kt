package ArraysAndHashing

class ValidAnagram() {

    // This is a code that I came up with. It uses hashmaps to check occurrences
    // of each char in strings and comparing them
    fun isAnagramFirst(s: String, t: String): Boolean {
        val sLettersAmount = HashMap<Char, Int>()
        val tLettersAmount = HashMap<Char, Int>()

        if (s.length != t.length) return false

        for (char in s) {
            if (sLettersAmount[char] == null) {
                sLettersAmount[char] = 1
                continue
            }
            sLettersAmount[char] = sLettersAmount[char]!! + 1
        }

        for (char in t) {
            if (tLettersAmount[char] == null) {
                tLettersAmount[char] = 1
                continue
            }
            tLettersAmount[char] = tLettersAmount[char]!! + 1
        }

        for (char in sLettersAmount.keys) {
            if (tLettersAmount[char] != tLettersAmount.getOrDefault(char, 0)) return false
        }

        return true
    }

    // Another solution that technically doesn't use any extra space, but for me, it runs a lot slower than
    // the code above. This method works because strings will be equal when they are sorted if they are anagrams
    fun isAnagramSecond(s: String, t: String): Boolean {
        return s.split("").sorted() == t.split("").sorted()
    }
}

fun main() {
    println(ValidAnagram().isAnagramFirst("car", "rat"))
}