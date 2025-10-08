/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author WINDOWS 11
 */
public class SistemInformasiTataTertib {
    private List<Pelanggaran> daftarPelanggaran = new ArrayList<>();
    
    public void catatPelanggaran(Pelanggaran pelanggaran) {
        daftarPelanggaran.add(pelanggaran);
        System.out.println("Pelanggaran dicatat untuk :" + pelanggaran.getPelanggar().getNama());
    }
    
    public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
        System.out.println("Riwayat pelanggaan untuk " + anggota.getNama() + " :");
        for (Pelanggaran p : daftarPelanggaran) {
            if (p.getPelanggar().getId().equals(anggota.getId())) {
                System.out.println("Tanggal : " + p.getTanggal());
                System.out.println("Peraturan : " + p.getPeraturanDilanggar().getPeraturan());
                System.out.println("Sanksi : " + p.getPeraturanDilanggar().getSanksi());
            }
        }
    }
}
