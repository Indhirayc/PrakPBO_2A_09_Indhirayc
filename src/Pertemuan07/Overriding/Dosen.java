/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07.Overriding;

/**
 *
 * @author WINDOWS 11
 */
public class Dosen extends Manusia {
    @Override
    void makan() {
        System.out.println("Dosen makan sambil memeriksa tugas mahasiswa");
    }

    void lembur() {
        System.out.println("Dosen sering lembur membuat soal ujian");
    }
}