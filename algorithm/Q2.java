class CodeRunner {

    public static void main(String[] args) {
        int result = plus(7);
        int result2 = gauss(10);
        int result3 = sumof(3, 5);

        System.out.println(result3);
    }

    static int plus(int n) {
        int result = 0;

        for (int i = 1 ; i <= n; i++) {
            result +=i;
        }

        return result;
    }

    static int gauss(int n) {
        int one = 1;
        int plus = one + n;
        int div = n/2;

        int result = plus * div;

        return result;

    }

    static int sumof(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int result = 0;

        for (int i = b; i <= a; i++) {
            result +=i;
        }

        return result;
    }
}