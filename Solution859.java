class Solution859 {
    public boolean buddyStrings(String s, String goal) {
        char temp = 'a';
        String b[] = new String[s.length()];
        for(int i=0,j=i+1;i<s.length() && j>i;i++,j++){
            
            if(s.charAt(i)!=goal.charAt(i)){
                System.out.println("index"+i+"char:"+s.charAt(i)+"-----"+goal.charAt(i));
            }
            
        }
        return false;
    }
}
