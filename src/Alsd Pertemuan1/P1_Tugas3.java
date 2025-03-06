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
        int [] semester = new int[x];
        String [] hariKuliah = new String[x];

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah: ");
            namaMatkul[i] = input.nextLine();
            System.out.print("Masukkan jumlah sks: ");
            sks[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
            System.out.println("======================");
        }
        int menu;
        do {
            menu = menuPilihan();
            if (menu == 1) {
                tampilSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                System.out.println("======================");
            } else if (menu == 2) {
                tampilHariTertentu(namaMatkul, sks, semester, hariKuliah);
            } else if (menu == 3) {
                tampilSemesterTertentu(namaMatkul, sks, semester, hariKuliah);
            } else if (menu == 4) {
                tampilMatkulCari(namaMatkul, sks, semester, hariKuliah);
            }
        } while (menu != 5);
    }

    static void tampilSeluruhJadwal (String[] namaMatkul, int [] sks, int [] semester, String [] hariKuliah) {
        System.out.println();
        System.out.println("=== SELURUH JADWAL KULIAH ===");
        System.out.print("Mata Kuliah");
        System.out.print("\t\t\t\t\t\tsks");
        System.out.print("         Semester");
        System.out.print("\t    Hari Kuliah");
        System.out.println();
        for (int i = 0; i < namaMatkul.length; i++) {
                System.out.print(namaMatkul[i]);
                System.out.print("\t\t\t\t\t\t\t " + sks[i]);
                System.out.print("\t\t" + semester[i]);
                System.out.println("\t\t " + hariKuliah[i]);
        }
    }

    static void tampilHariTertentu (String[] namaMatkul, int [] sks, int [] semester, String [] hariKuliah) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Hari yang dicari: ");
        String hariCari = input.nextLine();

        System.out.println();
        System.out.println("=== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " ===" );
        System.out.print("Mata Kuliah");
        System.out.print("\t\t\t\t\t\tsks");
        System.out.print("         Semester");
        System.out.println();
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.print(namaMatkul[i]);
                System.out.print("\t\t\t\t\t\t\t " + sks[i]);
                System.out.print("\t\t" + semester[i]);
                System.out.println();
            }
        }
        System.out.println();
    }

    static void tampilSemesterTertentu (String[] namaMatkul, int [] sks, int [] semester, String [] hariKuliah) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Semester yang dicari: ");
        int semesterCari = input.nextInt();

        System.out.println();
        System.out.println("=== JADWAL KULIAH SEMESTER " + semesterCari + " ===" );
        System.out.print("Mata Kuliah");
        System.out.print("\t\t\t\t\t\tsks");
        System.out.print("         Hari Kuliah");
        System.out.println();
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.print(namaMatkul[i]);
                System.out.print("\t\t\t\t\t\t\t " + sks[i]);
                System.out.print("\t\t" + hariKuliah[i]);
                System.out.println();
            }
        }
        System.out.println();
    }

    static void tampilMatkulCari (String[] namaMatkul, int [] sks, int [] semester, String [] hariKuliah) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Matkul yang dicari: ");
        String Matkulcari = input.nextLine();
        System.out.println();
        System.out.println("=== JADWAL MATA KULIAH " + Matkulcari.toUpperCase() + " ===" );
        System.out.print("Mata Kuliah");
        System.out.print("\t\t\t\t\t\tsks");
        System.out.print("         Semester");
        System.out.print("\t    Hari Kuliah");
        System.out.println();
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(Matkulcari)) {
                System.out.print(namaMatkul[i]);
                System.out.print("\t\t\t\t\t\t\t " + sks[i]);
                System.out.print("\t\t" + semester[i]);
                System.out.println("\t\t " + hariKuliah[i]);
            }
        }
        System.out.println();
    }

    static int menuPilihan () {
        Scanner input = new Scanner(System.in);
        System.out.println("=== PILIHAN MENU ===");
        System.out.println("1. Seluruh Jadwal Kuliah");
        System.out.println("2. Jadwal Kuliah (Hari tertentu)");
        System.out.println("3. Jadwal Kuliah (Semester tertentu)");
        System.out.println("4. Mencari Mata Kuliah");
        System.out.println("5. Selesai.");
        System.out.print("Menu yng dipilih: ");
        return input.nextInt();
    }
}
