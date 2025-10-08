/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07;

/**
 *
 * @author WINDOWS 11
 */
public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setSt(Staff[] st) {
        this.st = st;
    }
    
    public void viewStaff() {
        int i;
        System.out.println("-------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("-------------------");
    }
    
    public void lihatInfo(){
        System.out.println("");
        System.out.println("==========================");
        System.out.println("DATA MANAGER");
        System.out.println("==========================");
        System.out.println("Manager :" + this.getBagian());
        System.out.println("NIP :" + this.getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.println("Tunjangan : " + this.getTunjangan());
        System.out.println("Gaji : " + this.getGaji());
        System.out.println("Bagian :" + this.getBagian());
        this.viewStaff();
    }
    
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }
}
