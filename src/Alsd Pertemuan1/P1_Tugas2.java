import java.util.Scanner;
public class P1_Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");    
        int sisi = input.nextInt();
        int menu = pilihanMenu();
        if (menu == 1) {
            volume(sisi);
        } else if (menu == 2) {
            luasPermukaan(sisi);
        } else if (menu == 3) {
            keliling(sisi);
        }
    }

    static int pilihanMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== PILIHAN MENU ===");
        System.out.println("1. Volume ");
        System.out.println("2. Luas Permukaan");
        System.out.println("3. Keliling");
        System.out.print("Menu yng dipilih: ");
        return input.nextInt();
    }

    static void volume (int sisi) {
        int v = (sisi * sisi * sisi);
        System.out.println("Volume : " + v);
    }

    static void luasPermukaan (int sisi) {
        int lP = 6 * (sisi * sisi);
        System.out.println("Luas Permukaan : " + lP);
    }

    static void keliling (int sisi) {
        int k = 12 * sisi;
        System.out.println("Keliling : " + k);
    }
}
