import java.util.Scanner;
public class P1_Pemilihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        int nlTugas, nlKuis, nlUTS, nlUAS;
        double nlAkhir;

        System.out.println("Progam Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas (0-100): ");
        nlTugas = input.nextInt();

        System.out.print("Masukkan Nilai Kuis(0-100): ");
        nlKuis = input.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        nlUTS = input.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        nlUAS = input.nextInt();

        if (nlTugas < 0 || nlTugas > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else if (nlKuis < 0 || nlKuis > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else if (nlUTS < 0 || nlUTS > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else if (nlUAS < 0 || nlUAS > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else {
            nlAkhir = (nlTugas * 0.2) + (nlKuis * 0.2) + (nlUTS * 0.3) + (nlUAS * 0.3);
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Nilai Akhir: " + nlAkhir);
            
        }

        nlAkhir = (nlTugas * 0.2) + (nlKuis * 0.2) + (nlUTS * 0.3) + (nlUAS * 0.3);


        if (nlAkhir <= 39) {
            System.out.println("Nilai Huruf yang didapatkan adalah E");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("TIDAK LULUS");
        } else if (nlAkhir > 39 && nlAkhir <= 50 ) {
            System.out.println("Nilai Huruf yang didapatkan adalah D");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("TIDAK LULUS");
        } else if (nlAkhir > 50 && nlAkhir <= 60 ) {
            System.out.println("Nilai Huruf yang didapatkan adalah C");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if (nlAkhir > 60 && nlAkhir <= 65 ) {
            System.out.println("Nilai Huruf yang didapatkan adalah C+");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if (nlAkhir > 65 && nlAkhir <= 73 ) {
            System.out.println("Nilai Huruf yang didapatkan adalah B");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
        }else if (nlAkhir > 73 && nlAkhir <= 80 ) {
            System.out.println("Nilai Huruf yang didapatkan adalah B+");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("SELMAT ANDA LULUS");
        }else if (nlAkhir > 80 && nlAkhir <= 100 ) {
            System.out.println("Nilai Huruf yang didapatkan adalah A");
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");      
        }  
    }
}