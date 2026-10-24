class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // int size = nums.length;
        // int[] left = new int[size];
        // int[] right = new int[size];

        // left[0] = 1;
        // right[size-1] = 1;

        // for(int i =1;i<size;i++){
        //     left[i] = left[i-1] * nums[i-1];
        // }
        // for(int j = size-2;j>=0;j--){
        //     right[j] = right[j+1] * nums[j+1];
        // }

        // for(int k =0;k<size;k++){

        //     nums[k] = left[k] * right[k];
        // }

        // return nums;
           int[] result = new int[nums.length];

        // Pass 1: result[i] = product of all elements to the LEFT of i
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }

        // Pass 2: multiply in the product of all elements to the RIGHT of i
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;

    }
}  
