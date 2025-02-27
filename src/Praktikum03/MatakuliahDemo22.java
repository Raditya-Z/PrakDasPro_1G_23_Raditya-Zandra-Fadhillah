package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Masukkan Jumlah elemen arrayofMataKuliah : ");
        x = sc.nextInt();
        Matakuliah22[] arrayofMatakuliah = new Matakuliah22[x];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayofMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah[i] = new Matakuliah22("", "", 0, 0);
            arrayofMatakuliah[i].tambahData(); 
        }

        for (int i = 0; i < arrayofMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah[i].cetakInfo();
        }
    }
}
