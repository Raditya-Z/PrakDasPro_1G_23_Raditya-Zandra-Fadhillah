package Pertemuan5;

import java.util.Scanner;
public class PemilihanBilangan23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String hasil;
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";

        System.out.println(angka + " adalah " + hasil);


    }

}
