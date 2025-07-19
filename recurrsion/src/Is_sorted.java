public class Is_sorted {
    public static void main(String[] args) {
int [] arr ={1,2,4,13,5,6};
int n = 5;
        printNos(n);
      //  System.out.println(mini(arr,1));
    }
    static boolean sorted(int [] nums , int start){
        int n = nums.length;
        //base condition
        if(start == n -1){
            return true;
        }

        if(nums[start]>nums[start+1]){
            return false;
        }



        else{
         return   sorted(nums,start+1);


        }
    }
    static boolean isfound(int [] nums, int target , int index){
        //base condition
        if(index > nums.length -1){
            return false;
        }
        return nums[index] == target || isfound(nums , target ,index+1);
    }
    //recursive program to calculate minimum and maximum value

    //maximum function
    static int maximum = 0;
    static int maxi(int [] arr , int index){
        //base conditiomn
        if(index==arr.length-1){
            return arr[maximum];
        }

        if(arr[maximum]<arr[index]){
            maximum = index;
        }
        return maxi(arr , index+1);
    }


    // for minimum
    static int min = 0;
    static int mini(int [] arr , int index){
        //base condition
        if(index == arr.length-1){
            return arr[min];
        }

        if(arr[min]>arr[index]){
            min= index;
        }
        return mini(arr , index+1);
    }

    static int reverse(int num ){
        //base condition
        if(num %10 == num){
            return num ;
        }
        int rem = num%10;


        return 10*rem + reverse(num/10);
    }


    static int rev(int n ) {
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum = 10 * sum + ld;
            n /= 10;
        }
        return sum;
    }
  static StringBuilder sb = new StringBuilder();
    static String reverse1(String s , int index){
        //base condition
        if(index == s.length()-1){
            sb.append(s.charAt(s.length()-1));
            return sb.toString();
        }
        else {
            sb.append(s.charAt(index));
        }
        reverse1(s,index+1);
        return sb.toString();
    }
    static  void printNos(int n) {

        // Your code here
        //base case
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n +" ");
    }
}

