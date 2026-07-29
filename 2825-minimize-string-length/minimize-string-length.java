import java.util.*;

class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        int n=set.size();
        return n;
    }
}
