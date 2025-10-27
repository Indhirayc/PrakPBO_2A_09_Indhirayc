/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS.UTS_SIRAMPASIEN09;

/**
 *
 * @author WINDOWS 11
 */
public class Dokter09 extends Orang09 {
    private int id09;
    private String spesialisasi09;

    public Dokter09(int id09, String nama09, boolean jenisKelamin09, String alamat09, String noTelp09, String spesialisasi09) {
        super(nama09, jenisKelamin09, alamat09, noTelp09);
        this.id09 = id09;
        this.spesialisasi09 = spesialisasi09;
    }

    public int getId09() { return id09; }
    public String getSpesialisasi09() { return spesialisasi09; }

    @Override
    public String toString() {
        return "ID Dokter: " + id09 + 
               "\n" + super.toString() + " | Spesialisasi: " + spesialisasi09 + 
               "\n_______________________________" + 
               "\n ";
    }
}