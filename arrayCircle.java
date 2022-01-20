package Databricks;

public class arrayCircle {

	public static void main(String[] args) {
		int[][] pairs = {{3,5},{1,5},{2,3},{1,4},{2,4}};
		
		int[] res = restoreCircle(pairs);
		for(int i=0;i<res.length;i++) System.out.print(" " +res[i]);
	}

	private static int[] restoreCircle(int[][] pairs) {
		int[] res = new int[pairs.length];
		res[0]=pairs[0][0];
		res[1]=pairs[0][1];
		int target=res[1];
		int len=2, flag=0;
		for(int i=2;i<pairs.length;i++) {
			for(int j=1;j<pairs.length;j++) {
				if(pairs[j][0]== target) {
					flag=0;
					for(int k=0;k<len;k++) {
						if(res[k]== pairs[j][1]) flag=1;
					}
					if(flag==0) {
						res[i]= pairs[j][1];
						target=res[i];
						len++;
						break;
					}
				}
				if(pairs[j][1]== target) {
					flag=0;
					for(int k=0;k<len;k++) {
						if(res[k]== pairs[j][0]) flag=1;
					}
					if(flag==0) {
						res[i]= pairs[j][0];
						target=res[i];
						len++;
						break;
					}
				}
			}
		}
		return res;
	}

}
