class MyQueue() {
    val list = mutableListOf<Int>()
    fun push(x: Int) {
        list.add(x)
    }

    fun pop(): Int {
        return list.removeFirst()
    }

    fun peek(): Int {
        return list[0]
    }

    fun empty(): Boolean {
        return list.isEmpty()
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