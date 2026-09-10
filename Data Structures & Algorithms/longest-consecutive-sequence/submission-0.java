class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current_num=num;
                int current_streak=1;
                while(set.contains(current_num+1)){
                    current_num++;
                    current_streak++;
                }
                longest=Math.max(longest,current_streak);
            }
        }
        return longest;
    }
}
