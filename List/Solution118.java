class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        r.add(1);
        res.add(r);
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevRow = res.get(i-1);
            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}
