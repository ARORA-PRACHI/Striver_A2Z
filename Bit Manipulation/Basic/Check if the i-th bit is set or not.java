// https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        if((n&(1<<k))!=0){
            return true;
        }
        return false;
    }
}
