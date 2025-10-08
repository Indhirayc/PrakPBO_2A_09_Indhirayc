/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan06.HewanOOP3;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        kucing.berjalan();
        kucing.menyusui();
        kucing.mengeong();

        Anjing anjing = new Anjing("Spike", 3);
        anjing.berjalan();
        anjing.menyusui();
        anjing.menggonggong();
        anjing.menjagaRumah();
    }
}