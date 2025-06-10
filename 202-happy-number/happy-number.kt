class Solution {
fun isHappy(n: Int): Boolean {
    /*
     * Input: n = 19
     * Output: true
     * 
     * Explanation:
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     */
    var res = n
    while (res != 1) {
        var currentRes = 0
        res.toString().forEach {
            val digit = Integer.parseInt(it.toString())
            currentRes += digit*digit
            print("" + digit + " ")
        }
        res = currentRes
        println(res)
        if (res in intArrayOf(2,3,4,5,6,8,9)) return false
    }
    
    return true
}
}