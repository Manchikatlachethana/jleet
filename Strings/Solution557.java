class Solution {
    public String reverseWords(String s) {
        if(s.length() == 1) return s;
        StringBuilder res = new StringBuilder();
        String words[] = s.split(" ");
        for(String w:words){
            StringBuilder curr = new StringBuilder(w);
            res.append(curr.reverse().toString()+" ");
        }
        return res.toString().trim();
    }
}
