//Find Anagram Mappings
//Return an index mapping array mapping from nums1 to nums2 where mapping[i] = j means the ith element in nums1 appears in nums2 at index j. 
class Solution760 {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int [] indexMapArr = new int[nums1.length];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            m.put(nums2[i],i);
        }
        for(int i = 0; i < nums1.length; i++){
            if(m.containsKey(nums1[i])){
                indexMapArr[i] = m.get(nums1[i]);
            }
        }
       return indexMapArr; 
    }
}

/*
Input: nums1 = [12,28,46,32,50], nums2 = [50,12,32,46,28]
Output: [1,4,3,2,0]
Explanation: As mapping[0] = 1 because the 0th element of nums1 appears at nums2[1], and mapping[1] = 4 
              because the 1st element of nums1 appears at nums2[4], and so on.
*/
