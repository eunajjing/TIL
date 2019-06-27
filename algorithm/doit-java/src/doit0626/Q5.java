package doit0626;

public class Q5 {
	
	int y;
	int m;
	int d;
	
	Q5(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	int before(int n) {
		if (d > n) return d-n;
		
		int temp = d-n;
		int mm = m;
		mm--;
		if (mm % 2 == 0) {
			if (mm == 2) return 28+temp;
			if (mm == 8) return 31+temp;
			return 30+temp;
		}
		return 31+temp;
	}
	
	int after(int n) {
		int temp = n+d;
		if (temp <= 28) return temp;
		if (m % 2 == 0) {
			if (m == 2) return temp-28;
			if (m == 8) {
				if (temp <= 31) return temp;
				return temp-31;
			}
			if (temp <= 30) return temp;
			return temp-30;
		}
		if (temp <= 31) return temp;
		return temp-31;
	}
	
	public static void main(String[] args) {
		Q5 q = new Q5(2019, 6, 1);
		System.out.println(q.after(31));
	}
	
}
