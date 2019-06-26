package doit0626;
import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		int[] oragin = new int[5];
		
		Random rand = new Random();
		
		for (int i = 0 ; i < oragin.length; i++) {
			oragin[i] = rand.nextInt(10);
		}
		
		int [] copyArr = new int[5];
		copy(copyArr, oragin);
		rcopy(copyArr, oragin);
	}
	
	static void copy(int[] a, int[] b) {
		for (int i = 0 ; i < b.length ; i++) {
			a[i] = b[i];
		}
	}
	
	static void rcopy(int[] a, int[] b) {
		
		int last = b.length -1;
		
		for (int i = 0; i< b.length; i++) {
			a[i] = b[last--];
		}
	}
}
