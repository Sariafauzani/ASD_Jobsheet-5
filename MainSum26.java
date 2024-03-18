import java.util.Scanner;
public class MainSum26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc26.nextInt();

        Sum26 sm = new Sum26(elm);
        System.out.println("===============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - "+ (i + 1) +" = ");
            sm.keuntungan[i] = sc26.nextDouble();
        }

        System.out.println("===============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen +" bulan adalah = "+ sm.totalBF(sm.keuntungan));
        System.out.println("===============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen +" bulan adalah = "+ sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}