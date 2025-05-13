//https://leetcode.com/problems/rotate-string/
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String comb=s+s;
        if(comb.contains(goal)) return true;
        return false;
    }
}
