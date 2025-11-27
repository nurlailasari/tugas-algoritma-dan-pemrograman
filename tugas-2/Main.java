import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String golongan;
        int jam;
        double gajiPokok = 0, persen = 0, gajiLembur, totalGaji;

        // Input
        System.out.print("Masukkan Golongan (A/B/C): ");
        golongan = input.next().toUpperCase();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jam = input.nextInt();

  
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            System.exit(0);
        }

        if (jam == 1) {
            persen = 0.30;
        } else if (jam == 2) {
            persen = 0.32;
        } else if (jam == 3) {
            persen = 0.34;
        } else if (jam == 4) {
            persen = 0.36;
        } else if (jam >= 5) {
            persen = 0.38;
        } else {
            persen = 0;
        }

        // Menghitung gaji dan total lembur
        gajiLembur = gajiPokok * persen;
        totalGaji = gajiPokok + gajiLembur;

        // Output
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Gaji Pokok       : Rp " + (int) gajiPokok);
        System.out.println("Gaji Lembur      : Rp " + (int) gajiLembur);
        System.out.println("Total Penghasilan: Rp " + (int) totalGaji);
    }
}
