import java.util.*;

class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        while (result.size() < n) {
            List<Integer> temp = new ArrayList<>();
            for (int x : result) {
                if (x * 2 - 1 <= n) temp.add(x * 2 - 1); 
            }
            for (int x : result) {
                if (x * 2 <= n) temp.add(x * 2); 
            }
            result = temp;
        }

        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = result.get(i);
        return arr;
    }
}
