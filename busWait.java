package Databricks;

public class busWait {

	public static void main(String[] args) {
		String[] schedule = {"12:30", "14:00","19:55"};
		String time = "14:30";
		System.out.println(solution(schedule,time));

	}

	private static String solution(String[] schedule, String timer) {
		int tempHr, tempMin, diffHr=0, diffMin=0;
		StringBuilder res = new StringBuilder();
		int timeHr = Integer.valueOf(timer.substring(0,2));
		int timeMin = Integer.valueOf(timer.substring(3,5));
		
		for(int i=0;i<schedule.length;i++) {
			tempHr = Integer.valueOf(schedule[i].substring(0,2));
			tempMin = Integer.valueOf(schedule[i].substring(3,5));
			if(tempHr > timeHr) {
				if(tempMin>=timeMin) {
					diffHr = tempHr - timeHr;
					diffMin = tempMin - timeMin;
					break;
				}
				else {
					diffHr = tempHr - timeHr - 1;
					diffMin = tempMin - timeMin + 60;
					break;
				}
			}
			if(tempHr == timeHr  && tempMin>=timeMin) {
				diffHr = tempHr - timeHr;
				diffMin = tempMin - timeMin;
				break;
			}
			
		}
		if(diffHr < 10) res.append("0");
		res.append(diffHr);
		res.append(":");
		if(diffMin < 10) res.append("0");
		res.append(diffMin);
		
		return res.toString();
	}

}
