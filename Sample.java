
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


// merge sorted array
//TIME COMPLEXITY:O(M+M)
//SPACE COMPLEXITY:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p3 = m+n-1;
        int p2= nums2.length-1;
        int p1= m-1;


        if (m ==0){
            while (p2>=0) {
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }

        }
        while(p2>=0 && p1 >=0) {
            if (nums2[p2] > nums1[p1]) {
                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            } else if(nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p3--;
                p1--;
                System.out.println(p3);
            } else{
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
        }

        while (p2>=0) {
            System.out.println(p3);
            System.out.println(p3);
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
    }
}
