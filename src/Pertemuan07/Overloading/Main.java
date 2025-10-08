/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Overloading;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total Sudut (1 parameter): " + segitiga.totalSudut(50));
        System.out.println("Total Sudut (2 parameter): " + segitiga.totalSudut(60, 40));
        System.out.println("Keliling (3 sisi): " + segitiga.keliling(5, 6, 7));
        System.out.println("Sisi miring (2 sisi): " + segitiga.keliling(3, 4));
    }
}
