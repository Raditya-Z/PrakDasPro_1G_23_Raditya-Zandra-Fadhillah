import java.util.Scanner;
public class P1_Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kodePlat;
        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char KOTA[][] = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Masukkan Kode Plat Nomor: ");
        kodePlat = input.next().charAt(0);

        if (kodePlat == 'A') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[0].length; j++) {
                    System.out.print(KOTA[0][j]);
                }
            }
        } else if (kodePlat == 'B') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[1].length; j++) {
                    System.out.print(KOTA[1][j]);
                }
            }
        } else if (kodePlat == 'D') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[2].length; j++) {
                    System.out.print(KOTA[2][j]);
                }
            }
        } else if (kodePlat == 'E') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[3].length; j++) {
                    System.out.print(KOTA[3][j]);
                }
            }
        } else if (kodePlat == 'F') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[4].length; j++) {
                    System.out.print(KOTA[4][j]);
                }
            }
        } else if (kodePlat == 'G') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[5].length; j++) {
                    System.out.print(KOTA[5][j]);
                }
            }
        } else if (kodePlat == 'H') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[6].length; j++) {
                    System.out.print(KOTA[6][j]);
                }
            }
        } else if (kodePlat == 'L') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[7].length; j++) {
                    System.out.print(KOTA[7][j]);
                }
            }
        } else if (kodePlat == 'N') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[8].length; j++) {
                    System.out.print(KOTA[8][j]);
                }
            }
        } else if (kodePlat == 'T') {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < KOTA[9].length; j++) {
                    System.out.print(KOTA[9][j]);
                }
            }
        } 
    }
}
