
import java.util.Scanner;

public class CekUsia14 {
    
    public static void main(String[] args) {
        int umur;
        String keterangan;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Umur : ");
        umur = sc.nextInt();
        
        if (umur < 13) {
            keterangan = "Anak";
        } else if (umur < 20) {
            keterangan = "Remaja";
        } else if (umur < 65) {
            keterangan = "Dewasa";
        } else {
            keterangan = "Lansia";
        }
        
        System.out.println("Keterangan : " + keterangan);
    }
}