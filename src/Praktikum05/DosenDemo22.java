import java.util.Scanner;
public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();
        DataDosen22 list = new DataDosen22(jumlah);
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Nama          : ");
            String nama = input.nextLine();
            System.out.print("Kode          : ");
            String kode = input.nextLine();
            System.out.print("Jenis Kelamin : ");
            String inputKelamin = input.nextLine().toLowerCase();
            Boolean jenisKelamin;
            if (inputKelamin.equals("pria")) {
                jenisKelamin = true;
            } else if (inputKelamin.equals("wanita")) {
                jenisKelamin = false;
            } else {
                System.out.println("Jenis kelamin tidak valid! Gunakan 'pria' atau 'wanita'.");
                return; 
            }
            System.out.print("Usia          : ");
            int usia = input.nextInt();
            input.nextLine(); 
            
            Dosen22 d = new Dosen22(kode, nama, jenisKelamin, usia);
            list.tambah(d);
        }
        
        System.out.println("Data dosen sebelum sorting");
        list.tampil();
        System.out.println("Data dosen setelah sorting berdasarkan Usia menggunakan Bubble Sort (ASC)");
        list.bubbleSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan Selection Sort (DSC)");
        list.selectionSort();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan Insertion Sort (DSC)");
        list.InsertionSort();
        list.tampil();
    }
}

