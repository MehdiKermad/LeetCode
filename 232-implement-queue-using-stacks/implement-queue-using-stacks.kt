class MyQueue() {
    val deque = ArrayDeque<Int>()
    fun push(x: Int) {
        deque.add(x)
    }

    fun pop(): Int {
        return deque.removeFirst()
    }

    fun peek(): Int {
        return deque[0]
    }

    fun empty(): Boolean {
        return deque.isEmpty()
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */