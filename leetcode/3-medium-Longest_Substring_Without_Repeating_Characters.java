// Variable silze sliding window solution
/* 
 To, find out a sliding window problem :-
> First thing is, we have given something like an "Array" | OR | "String" +++
> Second thing is, they are talking about either "subsequence" | OR | "substring" +++
> And third most thing is, either we have given a "window size i.e. k" | OR | we have to "manually find out window size" ---
> 2/3 It is a sliding window problem
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            // map.getOrDefault(current value, if there is no key give this value)
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            // j - i + 1 ----> Window Size
            if(map.size() == j - i + 1){
                max = Math.max(max, j - i + 1);
                j++;
            }
            else if(map.size() < j - i + 1){
                while(map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}

// abcabcbb
// bcb
// Easiest way

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }  
        return max;
    }
}