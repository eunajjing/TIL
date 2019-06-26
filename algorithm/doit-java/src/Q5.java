
public class Q5 {
	public static void main(String[] args) {
		printSqu(5);
	}
	
	static void printSqu(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void printPlus() {
		System.out.println(" | 1 2 3 4 5 6 7 8 9");
		System.out.println("--------------------");
		for (int i = 1; i <= 9 ; i++) {
			System.out.print(i+" |");
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.print(i+j+" ");			
			}
			System.out.println();
		}
	}
	
	static void printMul() {
		System.out.println(" | 1 2 3 4 5 6 7 8 9");
		System.out.println("--+------------------");
		for (int i = 1; i <= 9 ; i++) {
			System.out.print(i+" |");
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.print(i*j+" ");			
			}
			System.out.println();
		}		
	}
}