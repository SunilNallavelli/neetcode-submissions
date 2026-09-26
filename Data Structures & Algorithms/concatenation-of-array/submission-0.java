class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ar[]=new int[2*n];

        for(int k=0;k<n;k++){
            ar[k]=nums[k];
            ar[k+n]=nums[k];
        }
        return ar;
    }
}