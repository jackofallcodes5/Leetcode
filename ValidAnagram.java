import java.util.HashMap;


//  For leetcode program will start from here
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

     
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

       
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

//  Till here



    public static void main(String[] args) {

        // Test Case 1 (True)
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Input: " + s1 + ", " + t1);
        System.out.println("Output: " + isAnagram(s1, t1));

        System.out.println();

        // Test Case 2 (False)
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Input: " + s2 + ", " + t2);
        System.out.println("Output: " + isAnagram(s2, t2));

        System.out.println();

        // Test Case 3 (True)
        String s3 = "listen";
        String t3 = "silent";
        System.out.println("Input: " + s3 + ", " + t3);
        System.out.println("Output: " + isAnagram(s3, t3));
    }
}