class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       paragraph = paragraph.replaceAll("[^a-zA-z0-9 ]"," ").toLowerCase();
        String [] words = paragraph.split("\\s+");
        // for(String s:words){
        //     System.out.println(s);
        // }
        
        Set<String> bwords = new HashSet();
        for(String w:banned){
            bwords.add(w);
        }        
        Map<String, Integer> wcount = new HashMap<>();
        for(String s:words){
            if(!bwords.contains(s)){
                wcount.put(s,wcount.getOrDefault(s,0)+1);
            }
        }
        int value = Integer.MIN_VALUE;
        String key = "";
        for(Map.Entry<String,Integer> m:wcount.entrySet()){
            if(m.getValue() > value){
                value = m.getValue();
                key = m.getKey();
            }
        }        
       return key; 
    }
}
