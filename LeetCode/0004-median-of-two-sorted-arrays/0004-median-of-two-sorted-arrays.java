class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length,y=nums2.length;
        int[] nums = new int[x+y];
        int temp=0;
        for(int a:nums1) nums[temp++]=a;
        for(int a:nums2) nums[temp++]=a;
        Arrays.sort(nums);

        if(nums.length%2==1) return (double)nums[nums.length/2];
        else return ((double)nums[nums.length/2-1]+(double)nums[nums.length/2])/2;

    }
}