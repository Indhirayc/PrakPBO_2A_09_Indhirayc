/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan09.Percobaan2;

/**
 *
 * @author WINDOWS 11
 */
public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        PascaSarjana masterCumlaude = new PascaSarjana("Budi");
        Sarjana sarjanaCumlaude = new Sarjana("Rina");

        pakRektor.beriSertifikatMawapres(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
    }
}