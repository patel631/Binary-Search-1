class Matrix{

    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n -1;

        while(low<= high){
            int mid = low + (high-low)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target) {
                return true;
            }
            else if(target < matrix[row][col]){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Matrix mt = new Matrix();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 0;
        System.out.println(mt.searchMatrix(matrix, target));
    }
}