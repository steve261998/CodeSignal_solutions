package main;

public class flowerPots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1, 0, 0, 0, 0, 1};
		System.out.print(canPlaceFlowers(flowerbed,2));
	}
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(flowerbed.length == 1){
            if(flowerbed[0]==0 && n<=1) return true;
            else if(flowerbed[0]==1 && n==0) return true;
            else return false;
        }
        if(flowerbed.length == 2){
            if(flowerbed[0]==0 && flowerbed[1]==0 && n==1) return true;
            else return false;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(n==0) return true;
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0) n--;

        }
        if(n==0) return true;
        return false;
    }
}
