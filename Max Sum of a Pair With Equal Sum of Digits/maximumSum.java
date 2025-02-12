import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> sum = new HashMap<>();
        int max = -1;
        for(int i = 0 ; i< nums.length;i++){
            int sumNum = sumDigit(nums[i]);
            if (sum.containsKey(sumNum)) {
                max = Math.max(max, sum.get(sumNum) + nums[i]);
                sum.put(sumNum, Math.max(sum.get(sumNum), nums[i]));
            } else {
                sum.put(sumNum, nums[i]);
            }
        }
        return max;
    }

    private int sumDigit(int num){
        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }
        return digitSum;
    }
}



