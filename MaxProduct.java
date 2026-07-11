public class MaxProduct {


//  For leetcode program will start from here

    public static int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            ans = Math.max(ans, product);

            if (product == 0)
                product = 1;
        }

        product = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            ans = Math.max(ans, product);

            if (product == 0)
                product = 1;
        }

        return ans;
    }

//  Till here






    public static void main(String[] args) {

        int[][] tests = {

            // Test Case 1
            {2, 3, -2, 4},

            // Test Case 2
            {2, 3, 0, -5, 6, -1, 4},

            // Test Case 3
            {-1, -2, -3, 0, -4, -5, -6, 2, 3, 0, -7, -8, 9},

            // Test Case 4
            {1, -2, -3, 4, -1, 2, 1, -5, 4, -2, -3, 6, -7, 8, -9, 10},

            // Test Case 5 (Very Challenging)
            {
                2, -3, 4, -1, 0,
                -2, -5, 6, -3, 2,
                -4, 5, 0,
                3, -2, -7, 8, -1,
                9, -10, 2, -3, 4,
                -5, 6, -7, 8, 9,
                -2, -3, 4, 0,
                -1, -2, -3, -4, 5
            }

        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test Case " + (i + 1));
            System.out.print("Array: ");

            for (int num : tests[i]) {
                System.out.print(num + " ");
            }

            System.out.println();
            System.out.println("Maximum Product = " + maxProduct(tests[i]));
            System.out.println("--------------------------------------------");
        }
    }
}
