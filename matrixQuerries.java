package Databricks;

import java.util.Arrays;
import java.util.Collections;

public class matrixQuerries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{11,2,9,1},{17,4,0,32},{1,7,10,6},{80,3,5,14}};
		int[] queries = {0,1,2,0};
		a = solution(a,queries);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

	private static int[][] solution(int[][] a, int[] queries) {
		int[][] res = Arrays.stream(a)
	             .map((int[] row) -> row.clone())
	             .toArray((int length) -> new int[length][]);
		for(int i=0;i<queries.length;i++) {
			if(queries[i]==0) res=rotate90(res);
			else if(queries[i] == 1) res=reflectMain(res);
			else res = reflectSecond(res);
		}
		return res;
	}

	private static int[][] reflectSecond(int[][] mat) {
		int n = mat.length;
		for (int i = 0; i < (n - 1); i++)
	        for (int j = 0; j < (n - 1) - i; j++)
	        {
	            int tmp = mat[i][j];
	                mat[i][j] = mat[(n - 1) - j][(n - 1) - i];
	                mat[(n - 1) - j][(n - 1) - i] = tmp;
	        } 
		return mat;
	}

	private static int[][] reflectMain(int[][] res) {
		for (int i = 0; i < res.length; i++)
            for (int j = 0; j <= i; j++)
                res[i][j] = res[i][j] + res[j][i] - (res[j][i] = res[i][j]);   
		return res;
	}

	private static int[][] rotate90(int[][] a) {
		int[][] res = reflectMain(a);
        for(int k=0;k<a.length;k++) {
        	for(int i=0;i<a.length/2;i++) {
        		int temp = a[k][i];
        		a[k][i]=a[k][a.length-1-i];
        		a[k][a.length-1-i] = temp;
        	}
        }
        
		return res;
	}
	

}
