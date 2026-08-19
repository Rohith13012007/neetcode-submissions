class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       
       
     for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
       for(Map.Entry<Integer,Integer> check:map.entrySet()){
        if(check.getValue()>1){
            return true;
        }
       }
       return false;
    }
}