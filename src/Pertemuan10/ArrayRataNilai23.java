package Pertemuan10;
import java.util.Scanner;
public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lulus = 0, tdkLulus = 0, jumlah;
        double totalLulus = 0, totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc.nextInt();
        int[] nilaiMhs= new int[jumlah];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += 1;
                totalLulus += nilaiMhs[i];
            } else {
                tdkLulus += 1;
                totalTdkLulus += nilaiMhs[i]; 
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
        }
        rataLulus = totalLulus/lulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        rataTdkLulus = totalTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai tidak lulus = " +rataTdkLulus);
    }
}
