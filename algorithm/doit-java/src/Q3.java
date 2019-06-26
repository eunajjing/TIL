import java.util.Scanner;

class Q3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요.");
        int a = scan.nextInt();
        int b;

        do {
            System.out.println("정수 b를 입력하세요.");
            b = scan.nextInt();
            
        } while (b < a);

        System.out.println(b - a);
    }

}