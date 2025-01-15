
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int col = matrix[0].length-1;
        int row = 0;


        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        return false;

    }
}
