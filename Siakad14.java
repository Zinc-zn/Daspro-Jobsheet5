
import java.util.Scanner;

public class Siakad14 {
    
    public static void main(String[] args) {
        String nama, nim, kelas, programStudi, nilaiHuruf, kualifikasi;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUAS, nilaiAkhir;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan Program Studi: ");
        programStudi = sc.nextLine();
        System.out.println("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.println("Masukkan Nomor Absen : ");
        absen = sc.nextByte();
        System.out.println("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan Nilai UTS : ");
        nilaiUjian = sc.nextDouble();

        nilaiKuis = (nilaiKuis*0.2);
        nilaiTugas = (nilaiTugas*0.15);
        nilaiUjian = (nilaiUjian*0.3);
        nilaiAkhir = (nilaiKuis+nilaiTugas+nilaiUjian);
        
        if (nilaiAkhir < 40) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else if (nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " +programStudi);
        System.out.println("Kelas : "+kelas+" Absen "+absen);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Akhir Huruf : "+nilaiHuruf);
        System.out.println("Kualifikasi : "+kualifikasi);
    }
}