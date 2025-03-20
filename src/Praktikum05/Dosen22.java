public class Dosen22 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen22(String kd, String name, Boolean jk, int umur) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = umur;
    }

    void tampil(){
        System.out.println("Nama            : " + nama);
        System.out.println("Kode            : " + kode);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + usia);
    }
}
