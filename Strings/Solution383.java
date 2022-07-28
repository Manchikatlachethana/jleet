class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char c:magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char r:ransomNote.toCharArray()){
            if(!map.containsKey(r)){
               return false;
            }
            map.put(r,map.get(r)-1);
            if(map.get(r) == 0){
                map.remove(r);
            }
        }
        return true;
    }
}
