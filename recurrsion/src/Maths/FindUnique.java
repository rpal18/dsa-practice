package Maths;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 78, 4, 3, 2};


        System.out.println(fu(arr));
    }

    private static int fu(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
}
