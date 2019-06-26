
public class Q6 {
	public static void main(String[] args) {
		npira(4);
	}
	
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n-i; k> 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print(i%10);				
			}
			System.out.println();
		}
	}
	
	static void spira(int n) {
		for (int i = 1; i <= n ; i++) {
			for (int k = n-i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i-1)*2+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for (int i = 1 ; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for (int i = n ; i > 0; i--) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n ) {
		for (int i = n ; i > 0 ; i--) {
			for (int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLB(int n) {
		for (int i = 0 ; i < n; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
