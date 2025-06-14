class MyStack() {
    val list = mutableListOf<Int>()
    fun push(x: Int) {
        list.add(0, x) // Add to the top
    }

    fun pop(): Int {
        return list.removeFirst()
    }

    fun top(): Int {
        return if (list.size > 0) {
            list[0]
        } else {
            -1
        }
    }

    fun empty(): Boolean {
        return list.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */