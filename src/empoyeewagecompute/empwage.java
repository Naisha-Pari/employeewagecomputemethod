package empoyeewagecompute;

public class empwage {
public static final int is_part_time=1;
public static final int is_full_time=2;
public static final int emp_rate_per_hour=20;
public static final int num_working_days=2;
public static final int max_hrs_month=10;
public static int computeEmpWage() {
	int emphrs=0,totalworkingdays=0,totalemphrs=0;
	while(totalemphrs<=max_hrs_month && totalworkingdays<num_working_days) {
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
	int totalempwage = totalemphrs * emp_rate_per_hour;
		System.out.println("total emp wage:" + totalempwage);
        return totalempwage;
}
public static void main(String[] args) {
	computeEmpWage();
}
}

