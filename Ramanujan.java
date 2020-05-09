public class Ramanujan {
    static int fac(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++)
            result *= j;
        return result;
    }

    public static void main(String[] args) {
        double pi = 1;
        double temp = 0;
        for (int i = 0; i < 25; i++)
            temp += (fac(4 * i) * (1103 + (26390 * i))) / (Math.pow((fac(i)), 4) * Math.pow(396, 4 * i));
        pi = 1 / ((Math.sqrt(8) / 9801) * temp);
        System.out.println("Pi: " + pi);
    }
}
