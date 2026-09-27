class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var p1 = m - 1
        var p2 = n - 1
        var write = m + n - 1

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[write--] = nums1[p1--]
            } else {
                nums1[write--] = nums2[p2--]
            }
        }

        while (p2 >= 0) {
            nums1[write--] = nums2[p2--]
        }
    }
}
