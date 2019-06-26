package doit0626;
import java.util.*;


public class Q8 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 : ");
		int y = scan.nextInt();
		System.out.print("월 : ");
		int m = scan.nextInt();
		System.out.print("일 : ");
		int d = scan.nextInt();
		
		int result = dayOfYear(y, m, d);
		
		System.out.println("그 해 "+result+"일째 입니다.");
		
		int result2 = leftDayOfYear(y, m, d);
		
		System.out.println("그 해는 "+result2+" 일 남았습니다. ");
		
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		
		int totalDay = 0;
		int year = isLeap(y);
		
		for (int i = 0; i < 12; i ++) {
			totalDay += mdays[year][i];
		}
		
		int today = dayOfYear(y, m, d);
		
		return totalDay - today;
	}
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		while(m != 1) {
			d += mdays[isLeap(y)][(m-1)];
			m--;
		}
		return d;
	}
}
