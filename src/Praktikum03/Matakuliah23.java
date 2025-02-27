package Praktikum03;

import java.util.Scanner;

public class Matakuliah23 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah23(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData () {
        String dummy;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");
    
        }

    }

    void cetakInfo() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Kode        : "+ kode);
            System.out.println("Nama        : "+ nama);
            System.out.println("Sks         : "+ sks);
            System.out.println("Jumlah Jam  : "+ jumlahJam);
            System.out.println("-------------------------------");
        }
    }
}