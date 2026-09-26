class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result=new HashSet<>();

        for(int i=0;i<nums.length;i++){

            Set<Integer> numset=new HashSet<>();

            for(int j=i+1;j<nums.length;j++){

                int required = -(nums[i]+nums[j]);
                List<Integer> triplet =new ArrayList<>();
                if(numset.contains(required)){
                     triplet = Arrays.asList(nums[i],nums[j],required);
                 Collections.sort(triplet);
                  result.add(triplet);

                };
              
                    numset.add(nums[j]);
            }
          

        }
        return new ArrayList<>(result);
    }
}
