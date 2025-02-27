import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen22[] arrayOfDosen = new Dosen22[3]; 

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode              : ");
            String kode = sc.nextLine();
            System.out.print("Nama              : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin     : ");
            String inputKelamin = sc.nextLine().toLowerCase();
            Boolean jenisKelamin;
            if (inputKelamin.equals("pria")) {
                jenisKelamin = true;
            } else if (inputKelamin.equals("wanita")) {
                jenisKelamin = false;
            } else {
                System.out.println("Jenis kelamin tidak valid! Gunakan 'pria' atau 'wanita'.");
                return; 
            }
            System.out.print("Usia              : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------------");

            arrayOfDosen[i] = new Dosen22(kode, nama, jenisKelamin, usia);
        }

        int data = 1;
        for (Dosen22 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + data);
            dosen.cetakInfo();
            data++;
        }

        System.out.println("\n=== ANALISIS DATA DOSEN ===");
        DataDosen22.dataSemuaDosen(arrayOfDosen);
        DataDosen22.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen22.rataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen22.infoDosenPalingTua(arrayOfDosen);
        DataDosen22.infoDosenPalingMuda(arrayOfDosen);
    }
}
