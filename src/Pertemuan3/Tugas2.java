package Pertemuan3;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int jumlahJamKerja, upahPerJam;
        double gajiKaryawan, bonusGaji, gajiSebelumPajak, pajak, gajiSetelahPajak;

        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        jumlahJamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = input.nextInt();

        gajiKaryawan = jumlahJamKerja * upahPerJam;
        System.out.println("Gaji Karyawan:" + gajiKaryawan);

        bonusGaji = 0.1 * gajiKaryawan;
        System.out.println("Bonus Gaji: " + bonusGaji);

        gajiSebelumPajak = gajiKaryawan + bonusGaji;
        System.out.println("Gaji Sebelum Pajak: " + gajiSebelumPajak);
        
        pajak = 0.05 * gajiSebelumPajak;
        System.out.println("Pajak yang dikenakan: " + pajak);

        gajiSetelahPajak = gajiSebelumPajak - pajak;
        System.out.println("Gaji Setelah Pajak: " + gajiSetelahPajak);

    }
    
}
