public class Euler {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 1; i < 50000; i++) {
            pi += (double) 1/(i*i);
        }
        pi *= 6;
        pi =Math.sqrt(pi);
        System.out.println("Pi: " + pi);
    }
}