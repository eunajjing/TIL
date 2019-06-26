package doit0626;
import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no = 0;
		
		System.out.println("10진수를 변환합니다.");
		do {
			System.out.println("음수가 아닌 양수로, 2에서 36 사이의 값을 입력해주세요.");
			no = scan.nextInt();
		} while (!(2 <= no && no <= 36));
		
		int obj = 0;
		
		do {
			System.out.println("어떤 숫자를 변환하시겠습니까?");
			obj = scan.nextInt();
		} while(obj < 0);
	
		
		char[] result = cardConvR(no, obj);
	}
	
	static char[] cardConvR(int no, int obj) {
		int orgin = obj;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int count = 0;
		
		do {
			obj /= no;
			count++;
		} while (obj != 0);
		
		char[] result = new char[count];
		
		System.out.println(no+"|"+orgin);
		
		for (int i = result.length -1 ; i >= 0 ; i--) {
			
			result[i] = dchar.charAt(orgin%no);
			System.out.println("  +--");
			System.out.println(no+"|"+orgin/no+"..."+dchar.charAt(orgin%no));
			orgin /= no;
		}
		
		
		return result;
	}

}
