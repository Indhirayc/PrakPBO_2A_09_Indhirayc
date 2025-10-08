/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP4;

/**
 *
 * @author WINDOWS 11
 */
public class Anjing extends Hewan {
    private String jenisBulu;

    public Anjing(String nama, int umur, String jenisBulu) {
        super(nama, umur);
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu() {
        return jenisBulu;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jenis bulu: " + jenisBulu);
    }

    public void menggonggong() {
        System.out.println("Anjing sedang menggonggong: Guk! Guk!");
    }
}