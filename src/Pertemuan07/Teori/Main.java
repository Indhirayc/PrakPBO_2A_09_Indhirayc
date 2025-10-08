/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Teori;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        Manajer man = new Manajer("Bill Gates", 5000000);
        Supervisor spv = new Supervisor("Susanto", 1000000);
        SalesManager slman = new SalesManager("Jessica", "IT", 2000000);

        man.naikkanGaji();
        spv.naikkanGaji();
        slman.naikkanGaji();

        man.cetakStatus();
        spv.cetakStatus();
        slman.cetakStatus();
    }
}