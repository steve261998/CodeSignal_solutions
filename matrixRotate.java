package Databricks;

public class matrixRotate {
	
	public static void main(String[] args) {
		int[][] arrix = {{1,1,1,2,1,3,4},
						{2,1,3,4,6,3,2},
						{9,3,5,2,7,4,2},
						{3,5,1,6,6,8,1}};

		int m=4,n=7;
		for(int i=0; i<m; i++) {
			 
			for(int j=0; j<n; j++) {
			 
			System.out.print(" "+ arrix[i][j]);;
			 
			}
			System.out.println();
			 
			}
		int[][] clockres = rotateMatrixclock(arrix);
		
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			 
			for(int j=0; j<m; j++) {
			 
			System.out.print(" "+ clockres[i][j]);;
			 
			}
			System.out.println();
			 
		}
		
		int[][] anticlockRes = rotateMatrixAnticlock(arrix);
		System.out.println();
		
		for(int i=0; i<n; i++) {
			 
			for(int j=0; j<m; j++) {
			 
			System.out.print(" "+ anticlockRes[i][j]);;
			 
			}
			System.out.println();
			 
		}
	}
	public static int[][] rotateMatrixclock(int[][] oldMatrix) {
		 
		int[][] newMatrix = new int[oldMatrix[0].length][oldMatrix.length];
		int k=0;
	    for(int i=0;i<oldMatrix[0].length;i++) {
	    	for(int j=oldMatrix.length-1;j>=0;j--){
	    		newMatrix[i][k] = oldMatrix[j][i];
	    		k++;
	    	}
	    	k=0;
	    }
	    return newMatrix;
	}
	
	public static int[][] rotateMatrixAnticlock(int[][] oldMatrix) {
		 
		int[][] newMatrix = new int[oldMatrix[0].length][oldMatrix.length];
		int k=0,l=0;
	    for(int i=0;i<oldMatrix[0].length;i++) {
	    	for(int j=oldMatrix.length-1;j>=0;j--){
	    		newMatrix[i][k] = oldMatrix[l][oldMatrix[0].length-i-1];
	    		k++;
	    		l++;
	    	}
	    	k=0;
	    	l=0;
	    }
	    return newMatrix;
	}
}
