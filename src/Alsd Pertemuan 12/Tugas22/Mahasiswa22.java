package Tugas22;

public class Mahasiswa22 {
    String nama;
    String nim;
    String prodi;

    public Mahasiswa22() {
    }

    public Mahasiswa22(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + prodi);
    }

}
