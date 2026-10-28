class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        boolean ans = false;
        for (int i = 0; i < rows; i++) {
            if (BinarySearch(matrix[i], target)) {
                ans = true;
            }
        }
        return ans;
    }
    public boolean BinarySearch(int[]matrix,int target){
        int low = 0;
        int high = matrix.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid]==target)return true;
            if(target>matrix[mid])low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
