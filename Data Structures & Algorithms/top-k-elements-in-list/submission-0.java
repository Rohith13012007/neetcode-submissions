class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
     HashMap<Integer,Integer>map=new HashMap<>();  
     for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
     } 
     for(int i=0;i<k;i++){
     int max=Collections.max(map.values()); 
     for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        if(entry.getValue()==max){
        arr[i]=entry.getKey();

         map.remove(entry.getKey());

                    break;
        }
     }
      
     }
     return arr;
    }
}
