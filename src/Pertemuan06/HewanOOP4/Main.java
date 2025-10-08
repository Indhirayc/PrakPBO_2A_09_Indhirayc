/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP4;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Objek Kucing ===");
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.info();
        kucing.berjalan();

        System.out.println("\n=== Objek Anjing ===");
        Anjing anjing = new Anjing("Spike", 3, "Pendek");
        anjing.info();
        anjing.menggonggong();

        System.out.println("Umur anjing (protected): " + anjing.umur);
        System.out.println("Jenis bulu (via getter): " + anjing.getJenisBulu());
    }
}
