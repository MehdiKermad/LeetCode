class NumArray(nums: IntArray) {
    val nums = IntArray(size = nums.size)
    init {
        for (i in 0 until nums.size) {
            this.nums[i] = nums[i]
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        var sum: Int = 0
        for (n in left..right) {
            sum += nums[n]
        }
        return sum
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */