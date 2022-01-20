package Databricks;

public class checkCyclic {

	public static void main(String[] args) {
		int[] numbers = {1, 10, 100, 1000};
		System.out.println(checkCycles(numbers));
	}

	private static int checkCycles(int[] numbers) {
		int digits=0, count=0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					//System.out.println("   " + numbers[i]+" "+numbers[j]);
					count++;
					break;
				}
				if(numberOfDigits(numbers[i]) == numberOfDigits(numbers[j])) {
					digits = numberOfDigits(numbers[j]);
					int temp = numbers[j];
					int powTen = (int) Math.pow(10, digits - 1);
				    for (int k = 0; k < digits - 1; k++)
				    {	
				        int firstDigit = temp / powTen;
				        int left = ((temp * 10) + firstDigit) -
				                    (firstDigit * powTen * 10);
				        if(numbers[i] == left) {
				        	count++;
				        	break;
				        }
				        temp = left;
				    }
				}
				else break;
			}
		}
		return count;
	}

	static int numberOfDigits(int n)
	{
	    int cnt = 0;
	    while (n > 0)
	    {
	        cnt++;
	        n /= 10;
	    }
	    return cnt;
	}

}
