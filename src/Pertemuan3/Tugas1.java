package Pertemuan3;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        int jumlahPenggunaanListrik = input.nextInt();

        int totalTagihan = jumlahPenggunaanListrik * 1500;
        boolean melebihi500 = jumlahPenggunaanListrik > 500;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan melebihi 500 kWh" + melebihi500);
        
    }


}

