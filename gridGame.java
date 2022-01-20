package main;

import java.util.Arrays;

public class gridGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] startPos = {0,1};
		int[] res = executeInstructions(3,startPos,"RRDDLU");
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static int[] executeInstructions(int n, int[] startPos, String s) {
        int[] temp = Arrays.copyOf(startPos, 2);
        int flag=0,count=0;
        char[] ch = s.toCharArray();
        int[] res = new int[ch.length];
        for(int i=0; i<ch.length; i++){
            for(int j=i ; j<ch.length;j++){
                if(ch[j] == 'R'){
                    if(temp[1]+1 < n){
                        temp[1]++;
                        count++;
                    } 
                    else{
                        res[i]=count;
                        flag=1;
                        break;
                    } 
                }
                else if(ch[j] == 'L'){
                    if(temp[1]-1 >=0){
                        temp[1]--;
                        count++;
                    } 
                    else{
                        res[i]=count;
                        flag=1;
                        break;
                    } 
                }
                else if(ch[j] == 'U'){
                    if(temp[0]-1 >=0){
                        temp[0]--;
                        count++;
                    } 
                    else{
                        res[i]=count;
                        flag=1;
                        break;
                    } 
                }
                else if(ch[j] == 'D'){
                    if(temp[0]+1 < n){
                        temp[0]++;
                        count++;
                    } 
                    else{
                        res[i]=count;
                        flag=1;
                        break;
                    } 
                }
            }
            if(flag == 0){
                res[i]=count;
            }
            count=0;
            flag=0;
            temp[0]=startPos[0];
            temp[1]=startPos[1];
        }
        return res;
    }
}
