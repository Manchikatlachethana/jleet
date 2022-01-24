class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            Map<Character,Integer> m1 = strToMap(s);
            Map<Character,Integer> m2 = strToMap(t);
            if(m1.equals(m2)){
                return true;
            }
        }
       return false;
    }
    
    public Map<Character,Integer> strToMap(String s){
        Map<Character,Integer> m1 = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(!m1.containsKey(s.charAt(i))){
                    m1.put(s.charAt(i),1);
                }else{
                m1.put(s.charAt(i),m1.get(s.charAt(i))+1);
                }
            }        
        return m1;        
    }
        
        
}
