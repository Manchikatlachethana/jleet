class Solution434 {
    public int countSegments(String s) {
        if(s.length()==0) return 0;
        String s1 = s.trim().replaceAll("\\s+"," ");
        String [] s2 = s1.split(" ");
        int count =0;
        for(String t:s2){
            //System.out.println("string is "+t);
            if(t.trim().length()!=0) count++;
        }
         return count; 
    }
}
