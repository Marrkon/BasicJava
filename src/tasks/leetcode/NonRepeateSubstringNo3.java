package tasks.leetcode;

import java.util.HashMap;
import java.util.Map;

public class NonRepeateSubstringNo3 {
    public NonRepeateSubstringNo3(){
        System.out.println("leetCode.NonRepeateSubstring");
        System.out.println(lengthOfLongestSubstring("abcabcd"));
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;

        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}

// n^3 my solution

//import java.text.StringCharacterIterator;
//        import java.text.CharacterIterator;
//        import java.lang.*;
//
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int maxSubstringSize = 0;
//
//        for (int i = 0; i <= s.length(); i++) {
//
//            Set set = new HashSet();
//            String strOut = s.substring(i, s.length());
//            CharacterIterator it = new StringCharacterIterator(strOut);
//
//            while (it.current() != CharacterIterator.DONE) {
//                if (set.contains(it.current())) {
//                    set.clear();
//                }
//                set.add(it.current());
//                maxSubstringSize = Math.max(maxSubstringSize, set.size());
//                it.next();
//            }
//        }
//        return maxSubstringSize;
//    }
//}