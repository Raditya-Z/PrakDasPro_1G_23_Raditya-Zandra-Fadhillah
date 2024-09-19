package Pertemuan4;
import java.util.Scanner;
public class Kuis23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jamSaatIni23, menitSaatIni23, jamMasukKUliah23, menitMasukKuliah23, sisaJam23, sisaMenit23;

        System.out.println("Nama    : Raditya Zandra Fadhillah");
        System.out.println("NIM     : 244107020144");
        System.out.println("Absen   : 23");
        System.out.println("=============== PROGAM MENGHITUNG JAM KULIAH ===========");
        System.out.print("masukkan jam saat ini: ");
        jamSaatIni23 = sc.nextInt();
        System.out.print("masukkan menit saat ini");
        menitSaatIni23 = sc.nextInt();

        System.out.println("jam saat ini: " + jamSaatIni23 + ":" + menitSaatIni23);

        System.out.print("masukkan jam masuk kuliah: ");
        jamMasukKUliah23 = sc.nextInt();
        System.out.print("masukkan menit masuk kuliah: ");
        menitMasukKuliah23 = sc.nextInt();

        System.out.println("jam kuliah anda dimulai: " + jamMasukKUliah23 + ":" + menitMasukKuliah23);

        sisaJam23 = jamMasukKUliah23 - jamSaatIni23;

        sisaMenit23 = menitMasukKuliah23 - menitSaatIni23;

        

        System.out.println("sisa waktu menuju jam kuliah: " + sisaJam23 + "jam" + sisaMenit23 + "menit");


    }
    
}
