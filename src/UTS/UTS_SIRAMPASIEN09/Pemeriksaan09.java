/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.UTS_SIRAMPASIEN09;
import java.util.Date;
/**
 *
 * @author WINDOWS 11
 */
public class Pemeriksaan09 {
    private int id09;
    private Date tanggalPemeriksaan09;
    private String keluhan09;
    private String diagnosa09;
    private String tindakan09;
    private String obat09;
    private Dokter09 dokter09;

    public Pemeriksaan09(int id09, Date tanggalPemeriksaan09, String keluhan09, String diagnosa09, String tindakan09, String obat09, Dokter09 dokter09) {
        this.id09 = id09;
        this.tanggalPemeriksaan09 = tanggalPemeriksaan09;
        this.keluhan09 = keluhan09;
        this.diagnosa09 = diagnosa09;
        this.tindakan09 = tindakan09;
        this.obat09 = obat09;
        this.dokter09 = dokter09;
    }

    public int getId09() { return id09; }
    public Date getTanggalPemeriksaan09() { return tanggalPemeriksaan09; }
    public String getDiagnosa09() { return diagnosa09; }
    public String getObat09() { return obat09; }

    @Override
    public String toString() {
        return "ID Pemeriksaan: " + id09 + 
               "\nTanggal: " + tanggalPemeriksaan09 +
               "\nKeluhan: " + keluhan09 + 
               "\nDiagnosa: " + diagnosa09 +
               "\nTindakan: " + tindakan09 + 
               "\nObat: " + obat09 +
               "\nDokter: " + dokter09.getNama09();
    }
}