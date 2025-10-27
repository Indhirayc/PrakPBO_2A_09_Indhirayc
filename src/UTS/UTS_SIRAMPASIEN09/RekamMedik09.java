/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.UTS_SIRAMPASIEN09;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author WINDOWS 11
 */
public class RekamMedik09 {
    private int id09;
    private Pasien09 pasien09;
    private List<Pemeriksaan09> daftarPemeriksaan09;

    public RekamMedik09(int id09, Pasien09 pasien09) {
        this.id09 = id09;
        this.pasien09 = pasien09;
        this.daftarPemeriksaan09 = new ArrayList<>();
    }

    public RekamMedik09() {
        this.daftarPemeriksaan09 = new ArrayList<>();
    }

    public void tambahPemeriksaan09(Pemeriksaan09 pemeriksaan09) {
        if (daftarPemeriksaan09 == null) {
            daftarPemeriksaan09 = new ArrayList<>();
        }
        daftarPemeriksaan09.add(pemeriksaan09);
    }

    public List<Pemeriksaan09> getDaftarPemeriksaan09() {
        return daftarPemeriksaan09;
    }

    public void setDaftarPemeriksaan09(List<Pemeriksaan09> daftarPemeriksaan09) {
        this.daftarPemeriksaan09 = daftarPemeriksaan09;
    }

    public int getId09() {
        return id09;
    }

    public Pasien09 getPasien09() {
        return pasien09;
    }
}