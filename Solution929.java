class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for(String email:emails){
            StringBuilder cleanMail = new StringBuilder();
            
            for(int i=0; i<email.length(); i++){
                char curChar = email.charAt(i);
                
                if(curChar == '+' || curChar == '@'){
                    break;
                }
                
                if(curChar != '.'){
                    cleanMail.append(curChar);
                }
                
            }
            
            StringBuilder domainName = new StringBuilder();
            
            for(int i=email.length()-1 ;i>=0; i--){
                char curChar = email.charAt(i);
                domainName.append(curChar);
                
                if(curChar == '@'){
                    break;
                }
            }
                domainName = domainName.reverse();
                cleanMail.append(domainName);
                uniqueEmails.add(cleanMail.toString());
            
        }
        
        return uniqueEmails.size();
        
    }
}
