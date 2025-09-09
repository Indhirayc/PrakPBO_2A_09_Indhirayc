/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan03;

/**
 *
 * @author WINDOWS 11
 */
public class AplikasiPinjol {
    public static void main(String[] args) {
        // Buat objek peminjam
        Pinjol p1 = new Pinjol("C001", "Andi", 0.1);
        p1.ajukanPinjaman(2000000);
        p1.cekSaldoTerhutang();
        p1.bayarAngsuran(500000);
        p1.penaltiKeterlambatan(3);
        p1.cekSaldoTerhutang();
    }
}
