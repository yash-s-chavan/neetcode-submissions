class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return(binaryColumnSearch(matrix, target, binaryRowSearch(matrix,target)));
    }
    public int binaryRowSearch(int[][] matrix, int target){
        int low = 0;
        int high = matrix.length-1;
        int check = 0;
        while(low<=high){
            int mid = (high+low)/2;
            if(matrix[mid][0] == target){
                return mid;
            }
            else if(matrix[mid][0] <target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            check = mid;
        }
        return (high+low)/2;
    }
    public boolean binaryColumnSearch(int[][] matrix, int target, int row){
        int low = 0;
        int high = matrix[row].length-1;
        System.out.println(row);
        while(low<=high){
            int mid = (high+low)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] <target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}
