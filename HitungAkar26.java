import java.util.Scanner;

public class HitungAkar26 {

    // Algoritma Brute Force untuk menghitung akar kuadrat
    public static int bruteForceSqrt(int n) {
        int sqrt = 0;
        while (sqrt * sqrt <= n) {
            sqrt++;
        }
        return sqrt - 1; // Bulatkan ke bawah
    }

    // Algoritma Divide and Conquer untuk menghitung akar kuadrat
    public static int divideConquerSqrt(int n) {
        if (n == 0 || n == 1) return n;
        int start = 1, end = n, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) return mid;
            if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input26.nextInt();

        // Menghitung akar kuadrat menggunakan Brute Force
        int sqrtBruteForce = bruteForceSqrt(bilangan);
        System.out.println("Akar kuadrat (Brute Force): " + sqrtBruteForce);

        // Menghitung akar kuadrat menggunakan Divide and Conquer
        int sqrtDivideConquer = divideConquerSqrt(bilangan);
        System.out.println("Akar kuadrat (Divide and Conquer): " + sqrtDivideConquer);
    }
}
