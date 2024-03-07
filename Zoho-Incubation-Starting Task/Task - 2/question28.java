package zoho_graduate_Studies;

public class question28 {
    public static void main(String[] args) {
        int n = 5;
        int sum = Sum(n);
        System.out.println(Series(n));
        System.out.println(sum);
    }

    public static int Sum(int n) {
        int sum = 0;
        int term = 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            term = term * 10 + num;
            sum += term;
        }
        return sum;
    }
    public static String Series(int n) {
        StringBuilder series = new StringBuilder();
        int term = 0;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            term = term * 10 + num;
            series.append(term);
            if (i < n) {
                series.append(" + ");
            }
        }
        return series.toString();
    }
}
