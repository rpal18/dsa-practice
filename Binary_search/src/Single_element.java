import java.util.EnumSet;

public class Single_element {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(peak(nums));
    }
   static  int peak(int [] nums){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start!=end){
            int mid = start + (end-start)/2;
            if((nums[mid]>nums[mid-1])&&(nums[mid]<nums[mid+1])){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
    //   static int singleNonDuplicate(int[] nums) {
//        int start =0;
//        int end = nums.length-1;
//        return  dup(start,end,nums);
//    }
//    static int dup(int start , int end , int [] arr){
//        //base conditon
//        if(start<=end){
//            return  end ;
//        }
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            int s2 = start;
//            int e1 = end;
//            if(arr[mid]==arr[mid+1]){
//                 s2 = mid+2;
//                 e1 =mid-1;
//            }
//            else if (arr[mid]==arr[mid-1]){
//                 e1 = mid-2;
//                 s2 = mid+1;
//            }
//            else {
//                return end;
//            }
//            if((e1-start +1)%2!=0){
//                dup(start ,e1,arr);
//            }
//            else{
//                dup(s2 , end , arr);
//            }
//        }
//        return -1;
//    }
//    static int singleNonDuplicate(int[] nums) {
//        // edge cases first
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        int start = 0;
//        int end = nums.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (mid == nums.length - 1 && nums[nums.length - 1] != nums[nums.length - 2]) {
//                return nums[mid];
//            }
//            if ((nums[mid] != nums[mid + 1]) && (nums[mid] != nums[mid - 1])) {
//                return nums[mid];
//            }
//                if ((nums[mid] != nums[mid + 1]) && (nums[mid] != nums[mid - 1])) {
//                    return nums[mid];
//                } else if (nums[mid] == nums[mid - 1]) {
//                    int p = mid - 2 + start + 1;
//                    if (((p) % 2 != 0) && p > 0) {
//                        end = mid - 2;
//                    } else {
//                        start = mid + 1;
//                    }
//                } else {
//                    if (((end - mid - 1) % 2 != 0) && ((end - mid - 1) > 0)) {
//                        start = mid + 2;
//
//                    } else {
//                        end = mid - 1;
//                    }
//                }
//            }
//        return -1;





