class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Character> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(m.containsKey(a)){
                //if already present in map
                //check if associated value of a is equal to char b;
                if(m.get(a)!=b){
                    return false;
                }
            }else{
                //if key is not present check 
                //if value b is already present in map
                if(m.containsValue(b)){
                    return false;
                }
                m.put(a,b);
            }
        }
        return true;
    }
}
