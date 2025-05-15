public class Mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa22(){
    
    }

    Mahasiswa22(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }

}