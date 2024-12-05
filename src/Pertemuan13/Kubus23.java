package Pertemuan13;
import java.util.Scanner;
public class Kubus23 {
     static int hitungLuasPermukaan (int s) {
        int Luas = 6 * s * s;
        return Luas;
    }

    static int hitungVolume (int ss) {
        int volume = ss * ss * ss;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi, lP, vol;
        System.out.print("Masukkan nilai sisi: ");
        sisi = input.nextInt();

        lP = hitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan Kubus adalah " + lP);

        vol = hitungVolume(sisi);
        System.out.println("Volume Kubus adalah " + vol);

    }

}
