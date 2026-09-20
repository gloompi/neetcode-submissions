class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var pointer = nums.size - 1
        var i = 0

        while (i < nums.size && pointer >= i) {
            if (nums[i] == `val`) {
                nums[i] = nums[pointer].also {
                    nums[pointer] = nums[i]
                }
                pointer--
            } else {
                i++
            }
        }

        return pointer + 1
    }
}
