
public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int foundValNums = 0; //create space in memory to hold numbers in array not equal to val
            for(int i = 0; i < nums.length; i++){ //O(n), n = nums.length, s(1), creating memory for int i
                if(nums[i] != val){ //if elements don't equal to val
                    nums[foundValNums] = nums[i]; //reassign those elements to the nums array
                    foundValNums++; //create space for more elements
                }
            }
            return foundValNums; //return new list of numbers
        }
    }
}
