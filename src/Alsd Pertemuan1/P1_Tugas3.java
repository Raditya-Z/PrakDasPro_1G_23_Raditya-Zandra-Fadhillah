import java.util.Scanner;

public class P1_Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        x = input.nextInt();
        input.nextLine();
        String[] namaMatkul = new String[x];
        int [] sks = new int[x];
        String [] hariKuliah = new String[x];

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah: ");
            namaMatkul[i] = input.nextLine();
            System.out.print("Masukkan jumlah sks: ");
            sks[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }
        int menu = menuPilihan();
        if (menu == 1) {
            System.out.println("=== SELURUH JADWAL KULIAH ===");
            for (i = 0, ) {
                
            }
        } else if (menu == 2) {
            
        } else if (menu == 3) {
            
        }

    }

    static int menuPilihan () {
        Scanner input = new Scanner(System.in);
        System.out.println("=== PILIHAN MENU ===");
        System.out.println("1. Seluruh Jadwal Kuliah ");
        System.out.println("2. Jadwal Kuliah (Hari tertentu)");
        System.out.println("3. Jadwal Kuliah (Semester tertentu)");
        System.out.print("Menu yng dipilih: ");
        return input.nextInt();
    }
}
