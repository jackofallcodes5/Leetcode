import java.util.*;

//  For leetcode program will start from here

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }



//  Till here





    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        int[] test1 = {3, 2, 3};
        System.out.println("Input: " + Arrays.toString(test1));
        System.out.println("Majority Element: " + solution.majorityElement(test1));
        System.out.println();

        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Input: " + Arrays.toString(test2));
        System.out.println("Majority Element: " + solution.majorityElement(test2));
        System.out.println();

        int[] test3 = {1};
        System.out.println("Input: " + Arrays.toString(test3));
        System.out.println("Majority Element: " + solution.majorityElement(test3));
    }
}