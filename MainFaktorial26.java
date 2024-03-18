import java.util.Scanner;

public class MainFaktorial26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial26[] fk = new Faktorial26[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial26();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("==============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long startTimeBF = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long endTimeBF = System.nanoTime();
        long elapsedTimeBF = endTimeBF - startTimeBF;
        System.out.println("Waktu eksekusi metode Brute Force : "+ elapsedTimeBF +" detik");
        System.out.println("==============================================");

        System.out.println("==============================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        long startTimeDC = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        long endTimeDC = System.nanoTime();
        long elapsedTimeDC = endTimeDC - startTimeDC;
        System.out.println("Waktu eksekusi metode Brute Force : "+ elapsedTimeDC +" detik");
        System.out.println("==============================================");
    }
}