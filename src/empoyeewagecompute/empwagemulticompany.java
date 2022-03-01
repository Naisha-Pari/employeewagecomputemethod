package empoyeewagecompute;

public class empwagemulticompany {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	public static int computeEmpWage(String company,int empRatePerHour,int numOfworkingDays,int maxhoursPerMonth) {
		int emphrs=0,totalemphrs=0,totalworkingdays=0;
		while (totalemphrs<=maxhoursPerMonth && totalworkingdays<numOfworkingDays) {
			totalworkingdays++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
			case is_part_time:
				emphrs=4;
				break;
			case is_full_time:
				emphrs=8;
				break;
				default:
					emphrs=0;
			}
			totalemphrs += emphrs;
			System.out.println("day:" + totalworkingdays + "emphrs:" +emphrs);
			}
		int totalempwage = totalemphrs * empRatePerHour;
			System.out.println("total emp wage:" + totalempwage);
	        return totalempwage;
	}
	public static void main(String[] args) {
		computeEmpWage("DMart",20,2,10);
		computeEmpWage("Reliance",10,4,20);
	}

	}

