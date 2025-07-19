
class Solution {
    int [] nums = {8,1,2,2,3};
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n =nums.length;
        int [] sum =new int[n];
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count=count+1;
                    sum[i]=count;
                }
            }
        }
        return sum;


    }
}