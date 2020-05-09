public class Leibniz {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 1; i < 100000000; i++) {
            if (i % 2 == 0) {
                pi -= (double) 1 / (2 * i - 1);
            } else {
                pi += (double) 1 / (2 * i - 1);
            }
        }
        pi *= 4;
        System.out.println("Pi: " + pi);
    }
}
