import java.util.Scanner;
public class MainPangkat26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc26.nextInt();

        Pangkat26[] png = new Pangkat26[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat26();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = sc26.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = sc26.nextInt();
        }

        System.out.println("====================================================");
        System.out.println("Pilih Metode Pemangkatan");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan {1/2} : ");
        int pilihan = sc26.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("====================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai "+ png[i].nilai +" pangkat "+ png[i].pangkat +" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("====================================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai "+ png[i].nilai +" pangkat "+ png[i].pangkat +" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
        System.out.println("====================================================");
    }
}