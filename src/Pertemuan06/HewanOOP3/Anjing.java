/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP3;

/**
 *
 * @author WINDOWS 11
 */
public class Anjing extends Mamalia {
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    void menggonggong() {
        System.out.println(nama + " menggonggong: Guk! Guk!");
    }

    void menjagaRumah() {
        System.out.println(nama + " sedang menjaga rumah!");
    }
}
