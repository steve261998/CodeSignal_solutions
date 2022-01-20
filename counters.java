package Databricks;

public class counters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOf2sinRange(22));
	}
	static int numberOf2sinRange(int n)
	{
	    int count = 1;
	    for (int i = 2; i <= n; i++) {
	    	count += number0f024s(i);
	    }
	    return count;
	}
	private static int number0f024s(int n) {
		int count = 0;
		int temp=n;
	    while (temp > 0)
	    {
	        if (temp % 10 == 0)
	        count++;
	 
	        temp = temp / 10;
	    }
	    temp=n;
	    while (temp > 0)
	    {
	        if (temp % 10 == 2)
	        count++;
	 
	        temp = temp / 10;
	    }
	    temp=n;
	    while (temp > 0)
	    {
	        if (temp % 10 == 4)
	        count++;
	 
	        temp = temp / 10;
	    }
	    return count;
	}
}
