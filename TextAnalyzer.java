package TextAnalyzer;
import java.util.Scanner;

public class TextAnalyzer {
    private static String teks = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pilihan;
        do {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    masukkanTeks(scanner);
                    break;
                case 2:
                    hitungJumlahKarakter();
                    break;
                case 3:
                    hitungJumlahKata();
                    break;
                case 4:
                    cariKata(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analyzer ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan !=5);
    }

    private static void masukkanTeks(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        teks = scanner.nextLine();
        if (!teks.isEmpty()) {
            System.out.println("Teks telah dimasukkan!\n");
        } else {
            System.out.println("Teks tidak boleh kosong. Silakan masukkan teks.\n");
        }
    }

    private static void hitungJumlahKarakter() {
        if (!teks.isEmpty()) {
            System.out.println("Jumlah karakter dalam teks: " + teks.length() + "\n");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
        }
    }

    private static void hitungJumlahKata() {
        if (!teks.isEmpty()) {
            String[] kataArray = teks.split("\\s+");
            System.out.println("Jumlah kata dalam teks: " + kataArray.length + "\n");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
        }
    }

    private static void cariKata(Scanner scanner) {
        if (!teks.isEmpty()) {
            System.out.print("Masukkan kata yang ingin dicari: ");
            String Carikata = scanner.nextLine();
            int jumlahKemunculan = hitungKemunculanKata(Carikata);
            System.out.println("Kata '" + Carikata + "' ditemukan sebanyak " + jumlahKemunculan + " kali dalam teks.\n");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
        }
    }

    private static int hitungKemunculanKata(String kata) {
        int berapakalimuncul = 0;
        String[] kataArray = teks.split("\\s+");

        for (String kataTeks : kataArray) {
            if (kataTeks.equalsIgnoreCase(kata)) {
                berapakalimuncul++;
            }
        }

        return berapakalimuncul;
}
}
