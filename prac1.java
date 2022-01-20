package Databricks;

public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {8,5,6,16,5};
		int l=1,r=3;
		boolean[] res = solve(array,l,r);
		for(int i=0; i<array.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

	private static boolean[] solve(int[] array,int l,int r) {
		boolean[] res = new boolean[array.length];
		int flag=0;
		for(int i=0;i<array.length;i++) {
			for(int j=l;j<=r;j++) {
				if(array[i]==((i+l)*j)) {
					flag=1;
					res[i]=true;
					break;
				}
			}
			if(flag==0) {
				res[i]=false;
			}
			else
				flag=0;
		}
		return res;
	}

}
