class MyQueue() {
    val root = Node(-1)
    var curr = this.root

    fun push(x: Int) {
        val newNode = Node(x)
        this.curr.next = newNode
        this.curr = newNode
    }

    fun pop(): Int {
        val node = this.root.next
        this.root.next = node?.next
        if (this.curr == node) {
            this.curr = this.root
        }
        
        if (node != null) {
            return node.value
        }
        return -1
    }

    fun peek(): Int {
        val node = this.root.next
        if (node != null) {
            return node.value
        }

        return -1
    }

    fun empty(): Boolean {
        return this.root.next == null
    }
}

data class Node(
    val value: Int,
    var next: Node? = null,
)

/**
 * Your MyQueue object will be instantiated and called as such:
 * val obj = MyQueue()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.peek()
 * val param_4 = obj.empty()
 */
