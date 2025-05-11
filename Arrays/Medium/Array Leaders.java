// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer>leaders=new ArrayList<>();
        int n=arr.length;
        int maxRight=arr[n-1];
        leaders.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxRight){
                maxRight=arr[i];
                leaders.add(maxRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}

