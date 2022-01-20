package Databricks;

public class checkDiv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "456";
        System.out.println(countSubStr(str));

	}
	static int countSubStr(String str)
    {
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++)
        {
            for(int j=i;j<len;j++) {
            	int temp = Integer.valueOf(str.substring(i,j+1));
            	if(temp%3 == 0) count++;
            }
        }
        return count;
    }

}
