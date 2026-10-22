class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                int freq = map1.get(s.charAt(i));
                map1.put(s.charAt(i),freq+1);
            }
            else map1.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                int freq = map2.get(t.charAt(i));
                map2.put(t.charAt(i),freq+1);
            }
            else map2.put(t.charAt(i),1);
        }
        for(int i=0;i<map1.size();i++){
            char ch = s.charAt(i);
            int freq = map1.get(ch);
            int freq2 = 0;
            if(map2.containsKey(ch)) {
                freq2 = map2.get(ch);
            }
            if(freq!=freq2)return false;
        }
        return true;
    }
}
