public class concatenationofarray {
    public static void main(String[] args) {
     int [] nums ={1,2,3,1,1,3};
     int ans=goodpair(nums);
        System.out.println(ans);
    }
//    public int[] getConcatenation(int[] nums) {
//        int n= nums.length;
//        int []ans = new int[2*n];
//        for (int i = 0; i < 2*n;i++){
//            nums[i]=ans[i];
//            ans[i]=ans[n+i];
//
//        }
    static int goodpair(int []nums){
        int i=0;
        int j = nums.length-1;
        int count=0;
        while(i<j){

            if(nums[i]==nums[j]){
                count++;
            }else{
                i++;
                j--;
            }

        }
        return count;
    }
}


