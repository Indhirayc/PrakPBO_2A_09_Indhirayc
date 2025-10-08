/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP3;

/**
 *
 * @author WINDOWS 11
 */
class Mamalia extends Hewan {
    public Mamalia(String nama, int umur) {
        super(nama, umur);
    }

    void menyusui() {
        System.out.println(nama + " menyusui anaknya...");
    }
}
