import java.util.Set;
import java.util.HashSet;

class Solution{
    public int lengthOfLongestSubstring(String s){

        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                // System.out.print("\ni=" + i +", j="+j + "->");
                if(allUnique(s, i, j)){
                    ans = Math.max(ans, j-i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i=start; i<end; i++){
            Character ch = s.charAt(i);
            // System.out.print(ch);
            if(set.contains(ch)){
                return false;
            }
            else{
                set.add(ch);
            }
        }
        return true;
    }

    public static void main(String[] args){

        Solution solution = new Solution();
        String string1 = "abcabcbb";
        String string2 = "bbbbbb";
        String string3 = "pwwkewstabbcd";
        System.out.println("The longest substring of "+string1 + " is "+solution.lengthOfLongestSubstring(string1));
        System.out.println("The longest substring of "+string2 + " is "+solution.lengthOfLongestSubstring(string2));
        System.out.println("The longest substring of "+string3 + " is "+solution.lengthOfLongestSubstring(string3));

    }
}