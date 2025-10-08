/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Teori;

/**
 *
 * @author WINDOWS 11
 */
public class Supervisor extends Manajer {

    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    // Override method naikkanGaji()
    public void naikkanGaji() {
        gaji += 1500000; // kenaikan gaji lebih besar
    }
}