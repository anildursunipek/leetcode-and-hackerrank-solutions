/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. */

// Solution 1

class Solution {
  public int[] twoSum(int[] nums, int target) {
      for(int i=0; i<nums.length; i++){
          for(int x=0; x<nums.length; x++){  
              if(x==i){
                  continue;
              }
              if((nums[i] + nums[x]) == target){
                  return new int[] {i,x};
              }
          }
      }
      return null;
  }
}

// Time Complexity -> O(n^2) --- 146 ms
// Space Complexity -> O(1) -> Constant space used 45.6 mb

// Solution 2 

class Solution2 {
  public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<nums.length; i++){
         map.put(nums[i], i);
      }

      for(int i=0; i<nums.length; i++){
         int complement = target - nums[i];
         if(map.containsKey(complement) && map.get(complement) != i)
              return new int[] {i, map.get(complement)};
      }
      return null;
  }
}

// Time Complexity -> O(n) --- 8 ms -> Used HashMap
// Space Complexity -> O(n) -> Constant space used 47.6 mb

// Solution 3

class Solution3 {
  public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<nums.length; i++){
          int complement = target - nums[i];
          if(map.containsKey(complement))
              return new int[] {i, map.get(complement)};
          map.put(nums[i],i);
      }
      return null;
  }
}

// Time Complexity -> O(n) --- 2 ms -> Used HashMap,  traversed the list containing nnn elements only once. 
// Space Complexity -> O(n) -> Constant space used 45.1 mb


