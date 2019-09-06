class TwoSum {
 public int twoSum(int[] nums, int target) {
     for(int i = 1; i <= nums.length; i++){
         int a = 0;
         int base = nums[a];
         int iteration = base+nums[i];
         if(iteration == target){ 
            return target;
         }
         a++;
     }
 }
 public int main(String[] args){
  int[] nums = {2, 7, 11, 15};
  twoSum(nums, 9);
 }
}