/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota1 anggota1 = new Anggota1("Iwan", "Jalan Mawar", 0);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());

        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());

    }
}
