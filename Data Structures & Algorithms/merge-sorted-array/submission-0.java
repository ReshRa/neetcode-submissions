class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] numbers = new int[m+n]; 
        int left = 0;
        int right = 0;
        int c1 = 0;

        while(left< m && right <n){
            if(nums1[left] < nums2[right]){
                numbers[c1] = nums1[left];
                left++;
            }else{

                numbers[c1] = nums2[right];
                right++;

            }
            c1++;
        }

        while(left <m){
            numbers[c1] = nums1[left];
            left++;
            c1++;
        }
        while(right <n){
            numbers[c1] = nums2[right];
            right++;
            c1++;
        }

        for(int i =0;i<numbers.length;i++){
            nums1[i] = numbers[i];
        }


    }
}