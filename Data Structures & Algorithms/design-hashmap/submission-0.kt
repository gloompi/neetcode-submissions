class MyHashMap() {
    private val store = IntArray(1_000_001) { -1 }
    
    fun put(key: Int, value: Int) {
        store[key] = value
    }

    fun get(key: Int): Int {
        return store[key]
    }

    fun remove(key: Int) {
        store[key] = -1
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
