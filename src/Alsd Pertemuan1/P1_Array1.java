import java.util.Scanner;

public class P1_Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        x = input.nextInt();
        input.nextLine();
        String[] namaMatkul = new String[x];

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nama Mata Kuliah " + (i+1) + " : ");
            namaMatkul[i] = input.nextLine();
        }

        double[] nilaiMatkul = new double[x];
        int[] bobotSKS = new int[x];
        for (int i = 0; i < bobotSKS.length; i++) {
            System.out.print("Masukkan bobot SKS MK " + namaMatkul[i] + ": ");
            bobotSKS[i] = input.nextInt();
        }
        int jmlSKS = 0;

        for (int i = 0; i < bobotSKS.length; i++) {
            jmlSKS += bobotSKS[i];
        }
    

        String[] nilaiHuruf = {"A", "B+", "B", "C+", "C", "D", "E"};
        double[] bobotNilai = {4, 3.5, 3, 2.5, 2, 1, 0};

        String[] nilaiHrf = new String[x];
        double[] nilaiSetara = new double[x];
        double ip = 0;

        System.out.println("======================");
        System.out.println("Progam Menghitung IP Semster");
        System.out.println("======================");

        for (int i = 0; i < nilaiMatkul.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + (namaMatkul[i]) + ": ");
            nilaiMatkul[i] = input.nextInt();
        }


        for (int i = 0; i < nilaiHrf.length; i++) {
            if (nilaiMatkul[i] <= 39) {
                nilaiHrf[i] = nilaiHuruf[6];
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50 ) {
                nilaiHrf[i] = nilaiHuruf[5];
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60 ) {
                nilaiHrf[i] = nilaiHuruf[4];
            }else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65 ) {
                nilaiHrf[i] = nilaiHuruf[3];
            }else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73 ) {
                nilaiHrf[i] = nilaiHuruf[2];
            }else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80 ) {
                nilaiHrf[i] = nilaiHuruf[1];
            }else if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100 ) {
                nilaiHrf[i] = nilaiHuruf[0];
            } 
        }

        for (int i = 0; i < nilaiSetara.length; i++) {
            if (nilaiMatkul[i] <= 39) {
                nilaiSetara[i] = bobotNilai[6];
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50 ) {
                nilaiSetara[i] = bobotNilai[5];
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60 ) {
                nilaiSetara[i] = bobotNilai[4];
            }else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65 ) {
                nilaiSetara[i] = bobotNilai[3];
            }else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73 ) {
                nilaiSetara[i] = bobotNilai[2];
            }else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80 ) {
                nilaiSetara[i] = bobotNilai[1];
            }else if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100 ) {
                nilaiSetara[i] = bobotNilai[0];
            } 
        }
        System.out.println("======================");
        System.out.println("hasil konversi nilai");
        System.out.println("======================");

        System.out.println("MK");
        System.out.print("\t\t\t\t\t\t\t Nilai Angka");
        System.out.print("    Nilai Huruf");
        System.out.print("\t Bobot Nilai");
        System.out.println();
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println(namaMatkul[i]);
            System.out.print("\t\t\t\t\t\t\t " + nilaiMatkul[i]);
            System.out.print("\t\t" + nilaiHrf[i]);
            System.out.println("\t\t " + nilaiSetara[i]);

        }
        
        System.out.println("======================");
        for (int i = 0; i < namaMatkul.length; i++) {
            ip += (nilaiSetara[i] * bobotSKS[i]);
        }
        
        ip /= jmlSKS;

        System.out.println("IP" + " : " + ip);

    }
}
