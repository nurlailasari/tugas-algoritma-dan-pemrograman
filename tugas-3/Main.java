import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array Gaji Pokok
        int[] gaji = {5000000, 6500000, 9500000};

        // Array persen lembur (%)
        double[] persenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        String golongan;
        int indexGolongan = -1; // index golongan dalam array
        int jam;
        double gajiPokok, gajiLembur, total;

        // Input
        System.out.print("Masukkan Golongan (A/B/C): ");
        golongan = input.next().toUpperCase();

        // Menentukan index golongan
        if (golongan.equals("A")) {
            indexGolongan = 0;
        } else if (golongan.equals("B")) {
            indexGolongan = 1;
        } else if (golongan.equals("C")) {
            indexGolongan = 2;
        } else {
            System.out.println("Golongan tidak valid!");
            System.exit(0);
        }

        // Ambil gaji pokok dari array berdasarkan index
        gajiPokok = gaji[indexGolongan];

        // Input 
        System.out.print("Masukkan Jumlah Jam Lembur: ");
        jam = input.nextInt();

        // Menentukan persentase lembur
        double persen;
        if (jam == 1) {
            persen = persenLembur[0];
        } else if (jam == 2) {
            persen = persenLembur[1];
        } else if (jam == 3) {
            persen = persenLembur[2];
        } else if (jam == 4) {
            persen = persenLembur[3];
        } else if (jam >= 5) {
            persen = persenLembur[4];
        } else {
            persen = 0;
        }

        // Hitung gaji lembur dan total
        gajiLembur = gajiPokok * persen;
        total = gajiPokok + gajiLembur;

        // Output
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Golongan          : " + golongan);
        System.out.println("Gaji Pokok        : Rp " + (int) gajiPokok);
        System.out.println("Persen Lembur     : " + (persen * 100) + "%");
        System.out.println("Gaji Lembur       : Rp " + (int) gajiLembur);
        System.out.println("Total Penghasilan : Rp " + (int) total);
    }
}
