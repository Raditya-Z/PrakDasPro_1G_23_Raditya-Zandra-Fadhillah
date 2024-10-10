package Pertemuan6;
import java.util.Scanner;
public class FlowchartLat123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int bil1, bil2, bil3, bilBesarSementara, bilBesarTetap;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = input23.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = input23.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = input23.nextInt();

        if (bil1 > bil2) {
            bilBesarSementara = bil1;
        } else {
            bilBesarSementara = bil2;
        }

        if (bil3 > bilBesarSementara) {
            bilBesarTetap = bil3;
        } else {
            bilBesarTetap = bilBesarSementara;
        }

        System.out.println("Bilangan Terbesar: " + bilBesarTetap);

    }
}
