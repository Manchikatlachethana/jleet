class Solution415 {
    public String addStrings(String num1, String num2) {
        
        int carry = 0;
        int result = 0;
        if(num1.length()<=num2.length()){
            // String a[] = new String[num2.length()];
            List<String> a = new ArrayList<>();
            int l1 = num1.length();
            int l2 = num2.length();
            for(int i=0;i<num1.length();i++){
                result = Integer.parseInt(Character.toString(num2.charAt(l2-i-1)))+
                                          Integer.parseInt(Character.toString(num1.charAt(l1-i-1)))+carry;
                if(result>9){
                    a.add(Integer.toString(result-10));
                    carry = 1; 
                }
                else{
                    carry = 0;
                    a.add(Integer.toString(result));
                }
            } 
            
          // a.add(num2[0]);
        for(int i = a.size()-1;i>=0;i--){
            System.out.print(a.get(i));
        }
        }
       return "";
    }
}
