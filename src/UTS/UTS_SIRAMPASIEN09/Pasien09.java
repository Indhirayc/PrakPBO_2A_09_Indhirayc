/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.UTS_SIRAMPASIEN09;

/**
 *
 * @author WINDOWS 11
 */
public class Pasien09 extends Orang09 {
    private int id09;
    private RekamMedik09 rekamMedik09;

    // Constructor utama
    public Pasien09(int id09, String nama09, boolean jenisKelamin09, String alamat09, String noTelp09) {
        super(nama09, jenisKelamin09, alamat09, noTelp09);
        this.id09 = id09;
    }

    // Overloading constructor
    public Pasien09(int id09, String nama09) {
        this(id09, nama09, true, "Belum diisi", "Belum diisi");
    }

    // Getter ID
    public int getId09() {
        return id09;
    }

    public RekamMedik09 getRekamMedik09() {
        return rekamMedik09;
    }

    public void setRekamMedik09(RekamMedik09 rekamMedik09) {
        this.rekamMedik09 = rekamMedik09;
    }

    @Override
    public String toString() {
        return "ID Pasien: " + id09 + 
               "\n" + super.toString()+ 
               "\n_______________________________" + 
               "\n ";
    }
}