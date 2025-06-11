class Solution {
    fun plusOne(digits: IntArray): IntArray {
        
        val lastDigitPos = digits.size - 1
        var increaseNextDigit = false
        
        if (digits[lastDigitPos] < 9) {
            digits[lastDigitPos] = digits[lastDigitPos] + 1
            return digits
        }
        
        for (d in lastDigitPos downTo 0) {
            if (d == lastDigitPos) {
                increaseNextDigit = true
                digits[d] = 0
            } else {
                val newUnit = digits[d]
                if (increaseNextDigit && newUnit == 9) {
                    digits[d] = 0
                } else if (increaseNextDigit && newUnit < 9) {
                    increaseNextDigit = false
                    digits[d] = newUnit + 1
                } else {
                    increaseNextDigit = false
                    digits[d] = newUnit
                }
            }
        }
        
        val newArray: IntArray
        if (increaseNextDigit) {
            newArray = intArrayOf(1, *digits)
        } else {
            newArray = intArrayOf(*digits)
        }

        return newArray
    }
}