import java.util.ArrayList;
import java.util.Scanner;

public class Keuntungan26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = input26.nextInt();

        ArrayList<double[]> keuntunganPerusahaan = new ArrayList<>();

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan keuntungan untuk perusahaan ke-" + (i + 1) + ": ");
            int jumlahBulan = input26.nextInt();

            double[] keuntunganBulan = new double[jumlahBulan];

            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " untuk perusahaan ke-" + (i + 1) + ": ");
                keuntunganBulan[j] = input26.nextDouble();
            }

            keuntunganPerusahaan.add(keuntunganBulan);
        }

        for (int i = 0; i < keuntunganPerusahaan.size(); i++) {
            double totalKeuntungan = 0;
            for (double keuntungan : keuntunganPerusahaan.get(i)) {
                totalKeuntungan += keuntungan;
            }
            System.out.println("Total keuntungan perusahaan ke-" + (i + 1) + ": " + totalKeuntungan);
        }
    }
}
