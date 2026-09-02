class Solution {
    public int[] twoSum(int[] nums, int target) {

        //creates hashmap
        Map<Integer, Integer> map = new HashMap<>();
        

        for(int i=0; i<nums.length; i++){ //iteration of array 
            int complement = target - nums[i]; //calc complemet of current number eg. target is 9 and current number is 1 then  will be complement and that 8 will be searched in the array

            if(map.containsKey(complement)){ // if 8 is present it will return...
                return new int[] {
                    map.get(complement),i};
            }
            map.put(nums[i], i); //else it will be added here in the map to its indez
        }

        return new int[] {};
    }
}