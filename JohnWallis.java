public class JohnWallis {
    public static void main(String[] args) {
        double pi = 1;
        for (int i = 1; i < 100000000; i++) {
            pi *= (double) (2 * i - 1) / (2 * i);
            pi *= (double) (2 * i + 1) / (2 * i);
        }
        pi /= 2;
        pi = 1 / pi;
        System.out.println("Pi: " + pi);
    }
}
