package Pertemuan9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int j = 1; j <= N; j++) { 
        for (int i = 1; i <= N; i++) {
            if (j > 1 && j < N) {
                if (i > 1 && i < N) {
                System.out.print("  ");
                } else {
                    System.out.print(" " + N);
                }
            } else {
                System.out.print(" " + N);
            }

        }
        System.out.println();

        }   
    }
}
