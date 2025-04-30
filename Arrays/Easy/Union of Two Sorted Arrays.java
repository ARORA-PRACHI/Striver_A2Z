// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer>set =new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
