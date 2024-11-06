package Pertemuan10;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah, total=0, rataRata;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc.nextInt();
        int[] nilaiMhs= new int[jumlah];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        System.out.println("-----------------------------------");
        System.out.println("DATA NILAI MAHASISWA");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" : "+nilaiMhs[i]);
        }
        rataRata = total/jumlah;
        System.out.println();
        System.out.println("Rata-rata nilai mahasiswa : " + rataRata);

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        System.out.println();
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
    }
}
