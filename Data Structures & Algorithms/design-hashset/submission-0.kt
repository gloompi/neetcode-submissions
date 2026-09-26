class MyHashSet() {
    val store = mutableListOf<Int>()

    fun add(key: Int) {
        store.add(key)
    }

    fun remove(key: Int) {
        store.removeAll { it == key }
    }

    fun contains(key: Int): Boolean {
        return store.contains(key)
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
