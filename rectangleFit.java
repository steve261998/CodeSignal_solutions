package Databricks;

import java.util.ArrayList;

public class rectangleFit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] operations = {{0, 1, 3}, {0, 4, 2}, {1, 3, 4},{1, 3, 2}};
		boolean[] res =  can_fit(operations);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+ " ");
		}
	}
	
	public static boolean[] can_fit(int[][] operations) {
		int max_side=0, second_max_side = 0, max_box_side=0,min_box_side=0;
		ArrayList<Boolean> op_result= new ArrayList<>();
		//boolean[] op_result = new boolean[2];
		for(int i=0;i<operations.length;i++) {
			max_box_side = (operations[i][1] > operations[i][2]) ? operations[i][1] : operations[i][2];
			min_box_side = (operations[i][1] < operations[i][2]) ? operations[i][1] : operations[i][2];
			if(operations[i][0]== 0) {
				max_side = (max_side > max_box_side) ? max_side : max_box_side;
				second_max_side = (second_max_side > min_box_side) ? second_max_side : min_box_side;
			}
			else {
				if(max_side <= max_box_side & second_max_side <= min_box_side) {
					op_result.add(true);
				}
				else {
					op_result.add(false);
				}
			}
			
		}
		boolean[] arr = new boolean[op_result.size()];
		return arr;
	}
}
