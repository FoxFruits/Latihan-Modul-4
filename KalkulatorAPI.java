package KalkulatorAPI;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.LongStream;


public class KalkulatorAPI {

    public static void main(String[] args) {


        double angka;
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.println("Pilih operasi (1/2/3/4/5):");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    try {
                        System.out.println("Masukkan angka:");
                        angka = sc.nextInt();
                        double hasilKuadrat = Math.sqrt(angka);
                        System.out.println("Hasil Akar kuadrat dari " + angka + " adalah " + hasilKuadrat);
                    }catch(InputMismatchException e){
                        System.out.println("Angka harus berupa bilangan bulat");
                    }
                    break;


                case 2:
                    System.out.println("Masukkan angka:");
                    angka = sc.nextInt();
                    System.out.println("Masukkan pangkat:");
                    double pangkat = sc.nextInt();
                    double hasilPangkat = Math.pow(angka, pangkat);
                    System.out.println(angka + "pangkat " + pangkat + " adalah " + hasilPangkat);
                    break;

                case 3:
                    System.out.println("Masukkan angka:");
                    angka = sc.nextInt();
                    double hasilLog = Math.log(angka);
                    System.out.println("Logaritma natural dari " + angka + " adalah " + hasilLog);
                    break;

                case 4:
                    try {
                        System.out.println("Masukkan angka:");
                        long fact = sc.nextLong();
                        long hasilfact = hitungfactorial(fact);
                        System.out.println("Nilai Faktorial dari " + fact + " adalah " + hasilfact);
                    } catch (InputMismatchException e)
                    {
                        System.out.println("Harus Bilangan bulat dan positif");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan Kalkulator API ini.");
                    System.exit(0);
            }
        }while(choice>5 || choice<1);

        }

    public static long hitungfactorial(long n)
    {
        return LongStream.rangeClosed (1, n).reduce (1, (long x, long y) -> x * y);
    }
}

