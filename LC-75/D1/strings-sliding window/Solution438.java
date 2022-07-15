class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        Map<Character,Integer> pmap = new HashMap<>();
        for(char c:p.toCharArray()){
            if(pmap.containsKey(c)){
                pmap.put(c,pmap.get(c)+1);
            }else{
                pmap.put(c,1);
            }           
        }
        
        Map<Character,Integer> smap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(smap.containsKey(ch)){
                smap.put(ch,smap.get(ch)+1);
            }else{
                smap.put(ch,1);
            }
            if(i>=p.length()){
                ch = s.charAt(i-p.length());
                if(smap.get(ch)==1){
                   smap.remove(ch); 
                }else{
                    smap.put(ch,smap.get(ch)-1);
                }
            }
            if(pmap.equals(smap)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}
