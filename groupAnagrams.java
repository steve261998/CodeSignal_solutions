package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class groupAnagrams {
	 public static List<List<String>> groupAnagrams1(String[] strs) {
		 List<List<String>> L1=new ArrayList<>();
	     int[] visited = new int[strs.length];
	       int flag=0;
	        for(int i=0; i<strs.length; i++)
	        {
	           List<String> l=new ArrayList<>();
	           if(visited[i] == 0) {
	        	   l.add(strs[i]);
		            for(int j=i+1; j<strs.length;j++){
		                String s=strs[j];
                        if(strs[i].equals(strs[j])){
                            visited[j]=1;
                            l.add(strs[j]);
                            flag=1;
                            break;
                        }
                        else{
                            for(int k=0;k<strs[j].length();k++){
                            	flag=0;
                            	if(l.get(0).contains(String.valueOf(s.charAt(k)))==false){
                            		flag=1;
                            		break;
		                        }
                            }
                            if(flag==0) {
    		                	visited[j]=1;
    		                	l.add(strs[j]);
    		                }
                        }
		            }
	           }
	           if(l.size() != 0) L1.add(l);
	        }
	        return L1;
	 }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"",""};
		List<List<String>> res = groupAnagrams1(input);
		//List<List<String>> res1 = groupAnagrams2(input);
		for(int i=0;i<res.size();i++) {
			System.out.println(Arrays.toString(res.get(i).toArray()));
		}
	}
    
    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int[] visited = new int[strs.length];
        int flag=0;
        for(int i=0;i<strs.length;i++){
        	List<String> temp = new ArrayList<>();
        	if(visited[i] == 0){
        		temp.add(strs[i]);
            	visited[i]=1;
                for(int j=i+1;j<strs.length;j++){
                    char[] a1 = strs[i].toCharArray();
                    char[] a2 = strs[j].toCharArray();
                    Arrays.sort(a1);
                    Arrays.sort(a2);
                    if(Arrays.equals(a1, a2)) {
                    	visited[j]=1;
                    	temp.add(strs[j]);
                    }
                }
        	}
            if(temp.size() !=0) result.add(temp);
            
        }
        return result;
    }
}
