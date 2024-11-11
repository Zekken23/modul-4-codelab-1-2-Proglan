package modul4;

import java.util.Scanner;

public class CD1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        String kalimatKapital = kalimat.toUpperCase();
        System.out.println("Huruf kapital: " + kalimatKapital);
        System.out.print("Masukkan kata yang ingin diganti: ");
        String kataAsli = scanner.nextLine();
        System.out.print("Masukkan kata pengganti: ");
        String kataPengganti = scanner.nextLine();
        String kalimatBaru = kalimat.replace(kataAsli, kataPengganti);
        System.out.println("Setelah mengganti kata: " + kalimatBaru);

        StringBuilder kalimatTerbalik = new StringBuilder(kalimat);
        kalimatTerbalik.reverse();
        System.out.println("Kalimat terbalik: " + kalimatTerbalik.toString());
    }
}