package solution;

class Solution {
    public int searchInsert(int[] nums, int target) {

        int begin = 0;
        int end = nums.length - 1;
        int middle;

        while (begin <= end) {

            middle = (begin + end) / 2;

            if (target < nums[middle])
                end = middle - 1;

            else if (target > nums[middle])
                begin = middle + 1;

            else
                return middle;
        }

        return begin;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 10};
        Solution s = new Solution();
        System.out.println(s.searchInsert(nums, 2));

    }
}
