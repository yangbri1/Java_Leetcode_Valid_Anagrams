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

        boolean result = isAnagram("hello", "hello");

        System.out.println(result);
    }
}