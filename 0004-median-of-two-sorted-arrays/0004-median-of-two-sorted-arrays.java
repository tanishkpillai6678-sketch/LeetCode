class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0.0;
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<=nums1.length-1;i++)
        {
            list1.add(nums1[i]);
        }
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<=nums2.length-1;i++)
        {
            list2.add(nums2[i]);
        }
        list1.addAll(list2);
        Collections.sort(list1);
        int s=list1.size();
        if(s%2==0)
        {
            return median=(list1.get((s/2)-1)+list1.get(s/2))/2.0;
        }
        return median=list1.get(s/2);
    }
}