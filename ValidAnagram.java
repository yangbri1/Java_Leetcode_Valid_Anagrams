import java.util.Arrays;
// incorporate 'Scanner' class from Java utility package to receive user inputs
import java.util.Scanner;

class Solution {
    // 'isAnagram' has a return type of 'boolean' and takes in 2 params of type 'String'
    public boolean isAnagram(String s, String t) {
        // converting the given 'String' s & t into char ary since there is no built-in String sort method in Java
        char[] sCharAry = s.toCharArray();
        char[] tCharAry = t.toCharArray();

        // invoke built-in 'Arrays.sort()' method which will mutate the original char ary
        Arrays.sort(sCharAry);
        Arrays.sort(tCharAry);

        // if()

        // utilize the built-in 'Arrays.equals()' method in order to compare the contents within 'sCharAry' & 'tCharAry'
        return Arrays.equals(sCharAry, tCharAry);
    }

    public static void main(String[] args){

        // instantiate a Scanner obj
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the first String: ");

        String strOne = scanner.nextLine();

        System.out.println("Please provide a second String: ");

        String strTwo = scanner.nextLine();

        // create an instance of 'Solution' class --- since this is a non-static method so 'new' required, not able to direct cal
        Solution solution = new Solution();

        // dot call 'isAnagram()' method within 'Solution' class ...
        // Note: Remember each data is separate from each instance --- data persists in static
        boolean result = solution.isAnagram(strOne, strTwo);
        // boolean result = isAnagram("hello", "hello");

        // output the results
        System.out.println(result);

        // safely closes the InputStream after use --- deallocating memory --- preventative measure against memory leaks
        // ... kinda like flush & helps in garbage collection
        scanner.close();
    }
}