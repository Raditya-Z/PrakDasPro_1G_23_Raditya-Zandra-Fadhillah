package Pertemuan5;
import java.util.Scanner;
public class PemilihanHariDenganIf23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber;
        String dayType;

        System.out.print("Input day number: ");
        dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "weekday";
         } else if (dayNumber == 6 || dayNumber == 7) {
             dayType = "weekend";
         } else {
             dayType = "invalid Number";
         }

        System.out.println(dayNumber + " is a " + dayType);
    }
}
