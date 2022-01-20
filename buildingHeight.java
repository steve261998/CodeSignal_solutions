package Databricks;

public class buildingHeight {

	public static void main(String[] args) {
		int[][] matrix = {
	              {3,0,8,4},                       // row1
	              {2,4,5,7},
	              {9,2,6,3},
	              {0,3,1,0},// row4
	          };
		int res = maxIncreaseKeepingSkyline(matrix);
		System.out.print(res);
	}
	    public static int maxIncreaseKeepingSkyline(int[][] grid) {
	        int[] horizontal_max= new int[grid.length];
	        int[] vertical_max = new int[grid.length];
	        int cur_max=0,cur_min=0,dif=0,res=0;
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid.length;j++){
	                cur_max=(grid[i][j]>cur_max) ? grid[i][j] : cur_max;
	            }
	            horizontal_max[i]=cur_max;
	            cur_max=0;
	        }
	        cur_max=0;
	        for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid.length;j++){
	                cur_max=(grid[j][i]>cur_max) ? grid[j][i] : cur_max;
	            }
	            vertical_max[i]=cur_max;
	            cur_max=0;
	        }
	        
	        for(int i=0;i<grid.length;i++){
	        	System.out.println(vertical_max[i]);
	        }
	        
	        /*for(int i=0;i<grid.length;i++){
	            for(int j=0;j<grid.length;j++){
	                cur_min=(horizontal_max[i]>vertical_max[j]) ? vertical_max[j] : horizontal_max[i];
	                
	                dif = cur_min-grid[i][j];
	                System.out.println(dif);
	                res+=dif;
	                cur_min=0;
	            }
	        }*/
	        return res;
	    }
}
