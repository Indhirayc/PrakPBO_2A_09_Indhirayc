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

        Sarjana sarjanaCumlaude = new Sarjana("Charlie");
        PascaSarjana masterCumlaude = new PascaSarjana("Budi");

        pakRektor.beriSertifikatMawapres(masterCumlaude);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}