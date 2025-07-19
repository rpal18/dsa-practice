public class Bs {
    public static void main(String[] args) {
int [] arr = {0,10,5,2};
int target =5;
        System.out.println(peakIndexInMountainArray(arr));
    }
//   static int lastindex(int [] nums , int target){
//        int start =0;
//        int end = nums.length-1;
//        int ans =-1;
//        while(start<=end){
//            int  mid = start + (end - start)/2;
//            if(nums[mid]==target){
//                ans =mid;
//                start = mid+1;
//            }
//            else if(nums[mid]>target){
//                end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//        }
//        return ans;
//    }
  static  int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans =-1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if ((nums[i]== nums[j] ) && i!=j) {
                    ans = nums[i];
                    break;
                }

            }
        }
        return ans;
    }
//    int countFreq(int[] arr, int target) {
//        // code here
//        int ans2 = lastindex(arr,target) - firstindex(arr,target) +1;
//        return ans2;
//    }
    static int firstindex(int [] arr , int target){
        int start =0 ;
        int end = arr.length-1;
        int ans =0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;

            }
            else if (arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    static int lastindex(int [] arr , int target){
        int start =0 ;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                start = mid+1;

            }
            else if (arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
  static  int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start =0;
        int end = n-1;
        while(start!=end){
            int mid = start +(end-start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }

        }
        return start;
    }
}

