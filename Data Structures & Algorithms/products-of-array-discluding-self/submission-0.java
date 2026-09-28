class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];

        int prefix=1;

        for(int i=0 ;i<n;i++){
            output[i]=prefix;
            prefix= prefix* nums[i];
        }
        
        int suffix=1;

        for(int j=n-1;j>=0;j--){

            output[j] = suffix* output[j];
            suffix=suffix*nums[j];
        }
        return output;
        
    }
}  
