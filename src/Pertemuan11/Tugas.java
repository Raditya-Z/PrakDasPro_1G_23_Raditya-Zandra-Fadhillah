package Pertemuan11;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rataKeseluruhan = 0, bagi = 0;
        int[][] survei = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            double rataResponden = 0;
            System.out.println("Responden ke-" + (i+1));

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print(" - Pertanyaan " + (j + 1) + " : ");
                survei[i][j] = sc.nextInt();

                if (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println(" Masuki antara 1 dan 5");
                    j--;
                }
                rataResponden += survei[i][j];
            }
            rataResponden /= survei[i].length;
            System.out.println("Rata-rata responden ke-" + (i+1) + " : " + rataResponden);
            System.out.println();
        }
        System.out.println();

        System.out.println("===== HASIL RATA-RATA PERTANYAAN DAN KESELURUHAN =====");
        for (int i = 0; i < survei[i].length; i++) {
            double rataPertanyaan = 0;
            System.out.print("Pertanyaan ke-" + (i+1) + " : ");

            for (int j = 0; j < survei.length; j++) {
                System.out.print(survei[j][i] + " ");
                rataPertanyaan += survei[j][i];
                rataKeseluruhan += survei[j][i];
            }
            System.out.println();
            rataPertanyaan /= survei.length;
            System.out.println(" Rata-rata pertanyaan ke-" + (i+1) + " : " + rataPertanyaan);
            System.out.println();
            bagi = survei.length * survei[i].length;
        }
        rataKeseluruhan /= bagi;
        System.out.println("Rata-rata keseluruhan nilai : " + rataKeseluruhan);

    }
}
