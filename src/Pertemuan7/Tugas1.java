package Pertemuan7;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, jumlahTiket, i = 0, totalTiket = 0, totalPenjualan = 0, totalBayar;
        double totalHarga = 0;

        do {
            System.out.print("Masukkan jumlah pembelian tiket: ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                System.out.println("selesai");
                break;
            }    

            if (jumlahTiket < 0) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            
            }

            if (jumlahTiket > 4 && jumlahTiket <= 10) {    
                totalBayar = hargaTiket * jumlahTiket;
                totalHarga = totalBayar - (totalBayar * 0.1); 
            } else if (jumlahTiket > 10) {
                totalBayar = hargaTiket * jumlahTiket;
                totalHarga = totalBayar - (totalBayar * 0.15);
            } else {
                totalBayar = hargaTiket * jumlahTiket;
                totalHarga = totalBayar;
            }
            
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
             
            System.out.println("Total harga penjualan tiket: Rp" + totalHarga);

        } while (true);

        System.out.println("Total penjualan tiket: " + totalTiket + " tiket");
        System.out.println("Total harga penjualan tiket: Rp" + totalPenjualan);
        
    }
}
