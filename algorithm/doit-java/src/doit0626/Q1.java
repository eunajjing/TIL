package doit0626;
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int[] height = new int[rand.nextInt(10)];
		
		System.out.println("사람들의 수와 키는 아래와 같습니다.");
		for(int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println(i+"번 째 사람의 키는 "+height[i]+"입니다. ");
		}
	}
}
