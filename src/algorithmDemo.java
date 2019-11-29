/**
 * Created by wangq on 2019/11/28.
 */
public class Solution {
  
  public int removeDuplicates(int[] nums){
      public int removeDuplicates(int[] nums){
        int newLength = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            //System.out.println("num[i]" + i + "是" + nums[i] + "---num[i+1]" + (i + 1) + "是" + nums[i + 1]);
            if (nums[i + 1] == nums[i]) {
               // System.out.println("-1操作");
                newLength -= 1;
            }
        }
        return newLength;
    }
  }
}
