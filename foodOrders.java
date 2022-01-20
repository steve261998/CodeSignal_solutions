package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class foodOrders {

	public static void main(String[] args) {
		List<List<String>> input = new ArrayList<List<String>>();
		List<String> temp = new ArrayList<>();
		input.add(Arrays.asList("David","3","Ceviche"));
		input.add(Arrays.asList("Corina","10","Beef Burrito"));
		input.add(Arrays.asList("David","3","Fried Chicken"));
		input.add(Arrays.asList("Carla","5","Water"));
		input.add(Arrays.asList("Carla","5","Ceviche"));
		input.add(Arrays.asList("Rous","3","Ceviche"));
		
		List<List<String>> res = displayTable(input);
		System.out.print(res);
		

	}
	public static List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<List<String>>();
        Set<String> items = new HashSet<>();
        Set<String> table = new HashSet<>();
        
        for(int i=0;i<orders.size();i++){
            items.add(orders.get(i).get(2));
            table.add(orders.get(i).get(1));
        }
        List<String> itemsList = new ArrayList<String>(items);
        List<String> tableList = new ArrayList<String>(table);
        Collections.sort(itemsList);
        itemsList.add(0,"Table");
        res.add(itemsList);
        int itemSize = items.size() - 1;
        
        for(int i=0;i<table.size();i++){
            List<String> temp = new ArrayList<String>();
            temp.add(tableList.get(i));
            for(int j=0;j<items.size();j++){
                temp.add("0");
            }
            res.add(temp);
        }
        
        int itemNo = 0,tableNo=0;
        for(int i=0;i<orders.size();i++){
            for(int j=1;j<itemsList.size();j++){
                if(orders.get(i).get(2).equals(itemsList.get(j))) itemNo =j;
            }
            for(int j=0;j<tableList.size();j++){
                if(orders.get(i).get(1).equals(tableList.get(j))) {
                	tableNo =j+1;
                	break;
                }
            }
            int prev = Integer.valueOf(res.get(tableNo).get(itemNo));
            prev++;
            res.get(tableNo).set(itemNo,String.valueOf(prev));
        }
        
        return res;
    }

}
