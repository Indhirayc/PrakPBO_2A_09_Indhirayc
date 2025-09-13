/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
import java.util.Scanner;

public class TestKoperasiInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        int pilih;
        
        do {            
            System.out.println("\n === Menu Koperasi ===");
            System.out.println("1. Pinjam uang");
            System.out.println("2. Angsur Pinjaman");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            
            switch (pilih) {
                case 1 -> {
                    System.out.print("Masukan jumlah pinjaman : Rp. ");
                    double pinjam = sc.nextDouble();
                    donny.pinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
                }
                
                case 2 -> {
                    System.out.print("Masukkan jumlah angsuran: Rp");
                    double angsur = sc.nextDouble();
                    donny.angsur(angsur); 
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());

                    
                }
                
                case 0 -> System.out.println("Terima kasih. Program selesai.");

                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilih !=0);
        
        sc.close();
    }
}

