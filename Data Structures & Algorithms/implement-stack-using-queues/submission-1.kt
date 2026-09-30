class MyStack() {
    val root = Node(-1)
    var lastNode = this.root

    fun push(x: Int) {
        val newNode = Node(x)
        this.lastNode.next = newNode
        newNode.prev = this.lastNode
        this.lastNode = newNode
    }

    fun pop(): Int {
        if (root.next == null) return -1
        val last = this.lastNode
        this.lastNode = last.prev!!
        this.lastNode.next = null
        return last.value
    }

    fun top(): Int {
        return this.lastNode.value
    }

    fun empty(): Boolean {
        return this.root.next == null
    }
}

data class Node(
    val value: Int,
    var next: Node? = null,
    var prev: Node? = null
)

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */
