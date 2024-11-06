package Pertemuan10;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah, total = 0;

        System.out.print("Masukkan jumlah pesanan : ");
        jumlah = sc.nextInt();
        String[] namaPesanan = new String[jumlah];
        int[] harga = new int[jumlah];

        for (int i = 0; i < namaPesanan.length; i++) {
            sc.nextLine();
            System.out.print("Masukkan nama makanan/minuman ke-"+(i+1)+" : ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga" + " : ");
            harga[i] = sc.nextInt();
            total += harga[i];

        }

        System.out.println();
        System.out.println("DAFTAR PESANAN");

        for (int i = 0; i < namaPesanan.length; i++) {
            System.out.println(namaPesanan[i]);
        }

        System.out.println("Total biaya : "+total);


    }
}
