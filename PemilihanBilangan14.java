
import java.util.Scanner;

public class PemilihanBilangan14 {
    
    public static void main(String[] args) {
      int angka;
      Scanner sc = new Scanner(System.in);

      System.out.println("Masukkan Angka :");
        angka = sc.nextInt();

        if (angka % 2 == 0)
        {
            System.out.println("Angka" + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + " temasuk bilangan ganjil");
        }
    }
  }