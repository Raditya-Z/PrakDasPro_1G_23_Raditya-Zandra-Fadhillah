import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen23[] arrayOfDosen = new Dosen23[3]; 

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

            arrayOfDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }

        int data = 1;
        for (Dosen23 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + data);
            dosen.cetakInfo();
            data++;
        }

    }
}
