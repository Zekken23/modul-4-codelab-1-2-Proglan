package modul4;

import java.util.Random;
import java.util.Scanner;

public class CD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menghasilkan Bilangan Bulat Acak");
            System.out.println("2. Memilih Elemen Acak dari Array");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai minimum: ");
                    int min = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan nilai maksimum: ");
                    int max = scanner.nextInt();
                    scanner.nextLine();

                    int randomInt = random.nextInt(max - min + 1) + min;
                    System.out.println("Bilangan bulat acak antara " + min + " dan " + max + ": " + randomInt);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah elemen dalam array: ");
                    int jumlahElemen = scanner.nextInt();
                    scanner.nextLine();

                    String[] array = new String[jumlahElemen];
                    for (int i = 0; i < jumlahElemen; i++) {
                        System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                        array[i] = scanner.nextLine();
                    }

                    int randomIndex = random.nextInt(jumlahElemen);
                    System.out.println("Elemen acak dari array: " + array[randomIndex]);
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih 1, 2, atau 3.");
            }
        }
    }
}