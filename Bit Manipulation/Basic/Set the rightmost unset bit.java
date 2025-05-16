// https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1

//Set the rightmost unset bit

class Solution {
    static int setBit(int n) {
        return n| (n+1);
    }
}

// unset the last set bit(rightmost)
class Solution {
    static int setBit(int n) {
        return n & (n-1);
    }
}
