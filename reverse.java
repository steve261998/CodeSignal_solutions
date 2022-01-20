package Databricks;

import java.util.ArrayList;
import java.util.Arrays;

public class reverse {

	public static void main(String[] args) {
		String[][] array = {{"0","HI"},{"1","Mitochondria is the power house of the cell"}};
		String[] res = solve(array,10,5);
		for(int i=0; i<array.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static String[] solve(String[][] array,int width,int userwidth) {
		
		ArrayList<String> messageWindow = new ArrayList<String>();
		for(int i=0;i<array.length;i++) {
			StringBuilder display= new StringBuilder();
			if(array[i][0]=="0") {
				if(array[i][1].length() < userwidth) {
					display.append(array[i][1]);
				}
				else {
					display.append(array[i][1]);
					messageWindow.add(Arrays.toString(array[i][1].split("(?<=\\G.{userwidth})")));
				}
			}
			else {
				int dif = width-userwidth;
				for(int j=0;j<dif;j++){
					display.append(" ");
				}
				if(array[i][1].length() < userwidth) {
					display.append(array[i][1]);
				}
				else {
					display.append(array[i][1]);
					messageWindow.add(Arrays.toString(array[i][1].split("(?<=\\G.{userwidth})")));
				}
				
			}
		}
		
		
		String[] result = new String[messageWindow.size()];
		result = (java.lang.String[]) messageWindow.toArray();
		return result;
	}
}
