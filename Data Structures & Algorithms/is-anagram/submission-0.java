class Solution {
    public boolean isAnagram(String s, String t) {
        int[]arr1 = new int[s.length()];
        int[]arr2 = new int[t.length()];
        if(s.length()!=t.length())return false;
        int n = s.length();
        for(int i=0;i<n;i++){
            arr1[i] = s.charAt(i);
            arr2[i] = t.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
   }
}
