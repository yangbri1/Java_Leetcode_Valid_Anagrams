import java.util.Arrays;

class Solution {
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

        // create an instance of 'Solution' class --- since this is a non-static method so 'new' required, not able to direct cal
        Solution solution = new Solution();

        // dot call 'isAnagram()' method within 'Solution' class ...
        // Note: Remember each data is separate from each instance --- data persists in static
        boolean result = solution.isAnagram("hello", "hello");
        // boolean result = isAnagram("hello", "hello");

        // output the results
        System.out.println(result);
    }
}