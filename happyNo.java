package main;

public class happyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isHappy(19));
	}
	public static boolean isHappy(int n) {
        int i=0,flag=0;
        while(i<50){
            n = sumSq(n);
            if(n==1){
                flag=1;
                break;
            }
            i++;
        }
        if(flag==1) return true;
        return false;
    }
    public static int sumSq(int n){
        int res=0;
        while(n>0){
            res= res+ (n%10)*(n%10);
            n/=10;
        }
        return res;
    }

}
