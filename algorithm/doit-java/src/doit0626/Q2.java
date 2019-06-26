package doit0626;
import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[6];
		
		System.out.println("6자리 숫자를 입력해주세요.");
		
		for (int i = 0; i< array.length; i++) {
			array[i] = scan.nextInt();
			System.out.println(array[i]+" 입력 ");
		}
		
		System.out.println("입력 종료 ");
		
		int[] result = reverse(array);
		
		int total = total(array);
		
		System.out.println("합계는 "+total);
		
	}
	
	static int[] reverse(int[] test) {
		int last = test.length - 1 ;
		
		for (int i = 0 ; i < test.length / 2; i++) {
			int temp = test[i];
			test[i] = test[last];
			test[last--] = temp;
		}
		
		return test;
	}
	
	static int total(int[] test) {
		
		int result = 0;
		
		for (int i = 0; i< test.length; i++) {
			result +=test[i];
		}
		
		return result;
	}
}
