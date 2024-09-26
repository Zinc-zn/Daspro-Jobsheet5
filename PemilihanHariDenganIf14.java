import java.util.Scanner;

public class PemilihanHariDenganIf14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan Angka :");
        angka = sc.nextInt();

        if (angka >= 1 && angka <= 5) {
            System.out.println("Angka "+angka+" Adalah Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println("Angka "+angka+" Adalah Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
