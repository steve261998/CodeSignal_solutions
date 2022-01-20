package Databricks;

public class fitFigure {

	public static void main(String[] args) {
	    int[][] nums = new int[][]{{1,2,3,2,5,7},
	        {4,5,6,1,7,6},
	        {7,8,9,4,8,3}};
	    for (boolean b: isSubMatrixFull(nums)) {
	      System.out.println(b);
	    }
	    //System.out.println(Arrays.toString(isSubMatrixFull(nums)));
	  }

	  public static boolean[] isSubMatrixFull(int[][] numbers) {
	    int n = numbers[0].length;
	    boolean[] subMatrix = new boolean[n-2];
	    int[] currentNumbers = new int[10];
	    // compute the first matrix
	    int k = 3;
	    for (int i = 0 ; i < k; i++) {
	      int[] column = getColumn(numbers,i);
	      for (int num: column) {
	        currentNumbers[num]++;
	      }
	    }
	    subMatrix[0] = checkValid(currentNumbers);

	    for (int i = 1; i < n-2; i++) {
	      int leftColumn =i-1;
	      // remove left column
	      for(int num : getColumn(numbers,leftColumn)) {
	        currentNumbers[num]--;
	      }
	      int rightColumn = i+2;
	      for(int num : getColumn(numbers,rightColumn)) {
	        currentNumbers[num]++;
	      }
	      subMatrix[i] = checkValid(currentNumbers);
	    }
	    return subMatrix;
	  }
	  public static int[] getColumn(int[][] matrix,int index) {
	    int[] column = new int[matrix.length];
	    for(int i = 0; i < matrix.length; i++) {
	      column[i] = matrix[i][index];
	    }
	    return column;
	  }
	  private static boolean checkValid(int[] nums){
	    for (int i = 1;  i < nums.length; i++) {
	      if (nums[i]!=1) {
	        return false;
	      }
	    }
	    return true;
	  }

}
