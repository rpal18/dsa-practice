import java.util.Scanner;

class main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        // System.out.println("enter no :");
        //int n =sc.nextInt();
        int target = 2;

        int ans = searchInsert(nums, target);
        System.out.println(ans);

    }

    /*  static int arrangeCoins(int n) {
          int start =0 ;
          int end = n;
          while(start<= end){
              double  mid = start+(end-start)/2;
              if (mid*(mid+1)/2>n){
                  end =(int) mid-1;
              }
              else if (mid*(mid+1)/2<n){
                  start =(int) mid+1;
              }
              else {
                  return (int)mid;
              }
          }
          return end;
      }
  }
  */
    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}