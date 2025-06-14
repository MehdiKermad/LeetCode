class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return s.length == t.length && s.groupingBy { it }.eachCount() == t.groupingBy { it }.eachCount()
    }
}