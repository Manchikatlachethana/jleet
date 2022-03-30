class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Double> set = new HashSet<>();
        for(int i:arr){
            if( set.contains((double)i*2) || set.contains((double)i/2)){
                return true;
            }           
            set.add((double)i);
            System.out.println(set);
        }
        return false;
    }
}
