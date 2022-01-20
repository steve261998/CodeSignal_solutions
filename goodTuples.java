package Databricks;

public class goodTuples {

	public static void main(String[] args) {
		int[] arrix = {1,1,1,2,1,3,4};
		int res = tuple_count(arrix);
		System.out.print(res);
	}

	private static int tuple_count(int[] arrix) {
		int count = 0;
		int len = arrix.length;
		for(int i=1;i<len-1;i++) {
			if(arrix[i-1]==arrix[i] && arrix[i-1]!=arrix[i+1]) {
				count++;
			}
			else if(arrix[i-1]==arrix[i+1] && arrix[i-1]!=arrix[i]){
				count++;
			}
			else if(arrix[i]==arrix[i+1] && arrix[i-1]!=arrix[i]){
				count++;
			}
		}
		return count;
	}

}
