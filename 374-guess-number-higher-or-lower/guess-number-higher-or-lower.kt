/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n: Int): Int {
        
        // Checking first if the given number was the right one
        if (guess(n) == 0) return n
        
        var min = 1
        var max = n

        while (min <= max) {
            val mid = min + (max - min) / 2
            when (val res = guess(mid)) {
                0 -> return mid
                -1 -> max = mid - 1
                1 -> min = mid + 1
            }
        }
        
        return min
    }
}