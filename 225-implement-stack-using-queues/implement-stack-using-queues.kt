class MyStack() {
    val deque = ArrayDeque<Int>()
    fun push(x: Int) {
        deque.add(0, x) // Add to the top
    }

    fun pop(): Int {
        return deque.removeFirst()
    }

    fun top(): Int {
        return deque.first()
    }

    fun empty(): Boolean {
        return deque.isEmpty()
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