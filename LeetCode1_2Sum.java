/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        Example:
        Given nums = [2, 7, 11, 15], target = 9,
        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].*/

class Solution {
    int n;
    int nums[];
    //public int[] twoSum(int[] nums, int target) {
public int twoSum(int [] nums, int n){
        this.n=n;
        int i = 0;

        for (int k = 0; k < nums.length; ) {
            i = k;
            while (i < nums.length - 1) {
                //System.out.printf("%d -> %d \n", k, i + 1);
                if (nums[k] + nums[i + 1] == n) {
                    System.out.printf("return[%d, %d] \n", k, i + 1);
                }
                i++;
            }
            k++;
        }
       return 0;
    }
}

class LeetCode1_2Sum {
    public static void main(String args[]) {
        int ne=9;
        int nums[] = new int[]{2, 7, 11, 15, 5, 4};
        Solution sol=new Solution();
        int ret=sol.twoSum(nums,ne);

    }
}


