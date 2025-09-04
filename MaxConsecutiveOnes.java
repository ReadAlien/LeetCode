class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        
        for(int num : nums) {
            if(num == 1) {
                current++;
            } else {
                current = 0;
            }
            if(max < current) {
                max = current;
            }
        }
        return max;
    }
}
