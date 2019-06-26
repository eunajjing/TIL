class CodeRunner {
    public static void main(String[] args) {
        int result = max4(1, 2, 3, 4);
        int result2 = min3(3, 2, 1);
        int result3 = min4(2, 3, 4, 5);

        System.out.println(result3);
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        if (max < d)
            max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        if (min > d)
            min = d;

        return min;
    }

}
