class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length){
            intersect(nums2,nums1);
        }
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for(int n:nums1){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int k=0;
        for(int n:nums2){
            int val = m.getOrDefault(n,0);
            if(val>0){
                res.add(n);
                m.put(n,val-1);
            }
        }
        int a[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            a[i] = res.get(i);
        }
        return a;
    }
}
