/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06;

/**
 *
 * @author WINDOWS 11
 */
public class Mahasiswa extends AnggotaKampus{
    private String nim;
    private String programStudi;

    public Mahasiswa(String nim, String programStudi, String nama, String id) {
        super(nama, id);
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}
