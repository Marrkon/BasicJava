package tasks.leetcode;

public class LongestCommonPrefixNo11 {

    public LongestCommonPrefixNo11(String[] str){
        longestCommonPrefix(str);
    }

    String returnCommonprefix(String str1, String str2) {
        int minLengthSubstring = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLengthSubstring; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, minLengthSubstring);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String substring = strs[0];
        for (int i = 1; i <= strs.length - 1 ; i++) {
            substring = returnCommonprefix(substring, strs[i]);
        }
        System.out.println(substring);
        return substring;
    }
}
