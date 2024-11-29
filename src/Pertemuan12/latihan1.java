package Pertemuan12;

public class latihan1 {
    public static void main(String[] args) {
 
    double thr, gaji, pendapatan, gajiPajak;

    gaji = 2000000;
    thr = gaji + 55000;

    gajiPajak = gaji - (gaji*0.05);

    pendapatan = thr + gajiPajak;

    System.out.println("THR :" + thr);
    System.out.println("Gaji setelah Pajak : " + gajiPajak);
    
    System.out.println("Pendapatan Karyawan : " + pendapatan   );



    }
}
