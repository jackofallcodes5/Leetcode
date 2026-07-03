import java.util.*;


//  For leetcode program will start from here
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for (int num : nums) {
            if (intSet.contains(num)) {
                return true;
            }
            intSet.add(num);
        }

        return false;
    }

//  Till here




    public static void main(String[] args) {

        // Array 1: 5 elements (Duplicate exists -> true)
        int[] array1 = {1, 2, 3, 4, 2};

        // Array 2: 6 elements (No duplicate -> false)
        int[] array2 = {5, 8, 12, 20, 25, 30};

        // Array 3: 15 elements (Duplicate exists -> true)
        int[] array3 = {10, 15, 8, 22, 35, 41, 50, 63, 77, 81, 95, 100, 22, 110, 120};

        System.out.println("Array 1 contains duplicate: " + containsDuplicate(array1));
        System.out.println("Array 2 contains duplicate: " + containsDuplicate(array2));
        System.out.println("Array 3 contains duplicate: " + containsDuplicate(array3));
    }
}