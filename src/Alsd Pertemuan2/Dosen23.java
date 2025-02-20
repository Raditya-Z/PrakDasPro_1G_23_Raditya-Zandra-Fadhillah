public class Dosen23 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi () {
        System.out.println("==================================");
        System.out.println("Nama: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        if (statusAktif == true) {
            System.out.println("Status: Aktif" );
        } else {
            System.out.println("Status : Tidak Aktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("==================================");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja (int thnSkrng) {
        int tahun = thnSkrng - tahunBergabung;
        System.out.println("Lama Kerja: " + tahun + " Tahun");
        return tahun;
    } 
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen23() {  
    }

    public Dosen23(String nm, String idDosen, boolean sttsAktif, int tahunBergabung, String bidangKeahlian) {
        nama = nm;
        this.idDosen = idDosen;
        statusAktif = sttsAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
