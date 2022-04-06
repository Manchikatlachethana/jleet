class Solution {
    public int compareVersion(String version1, String version2) {
        String [] v1 = version1.split("[.]");
        String [] v2 = version2.split("\\.");
//         for(int i=0;i<v1.length;i++){
//           System.out.println(v1[i]);  
//         }
       
//         for(String i:v2){
//           System.out.println(i);
//         }       
        int maxlen = Math.max(v1.length, v2.length);
        for(int i=0;i<maxlen;i++){
            int n1 = 0;
            if(i<v1.length){
                n1 = Integer.parseInt(v1[i]);
            }
            int n2 = 0;
            if(i<v2.length){
                n2 = Integer.parseInt(v2[i]);
            }
            
            if(n1<n2) return -1;
            if(n1>n2) return 1;
        }
        return 0;
    }
}
