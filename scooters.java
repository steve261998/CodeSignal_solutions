package Databricks;

import java.util.Arrays;

public class scooters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int finish=23;
		int[] scooters = {7,4,14};
		System.out.println(func(finish,scooters));
	}
	
	public static int func(int finish, int[] scooters) {
		int dist=0,x=0,i=0;
		if(scooters.length == 0) {
			return finish;
		}
		Arrays.sort(scooters);
		while(x<finish) {
			while(scooters[i]<x && i<scooters.length -1 ) {
				i++;
			}
			dist+=scooters[i]-x;
			x=scooters[i] +10;
			if(i == scooters.length -1 && x<finish) {
				dist+=finish-x;
				x=scooters[i]+10;
				return dist;
			}
		}
		
		return dist;
	}
	
}
/*
 def func(finish,scooters):
    if scooters == []:
        return finish
    scooters = sorted(scooters)
    dist = 0
    x = 0
    i = 0
    while(x < finish):
        while(scooters[i]<x and i < len(scooters) - 1):
            i+=1
        dist += scooters[i] - x
        x = scooters[i] + 10
        if(i == len(scooters) -1 and x < finish):
            dist += finish - x
            x = scooters[i] + 10
            return dist
        
    return dist
 */
