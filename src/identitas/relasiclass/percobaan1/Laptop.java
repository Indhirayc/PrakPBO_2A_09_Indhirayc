/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package identitas.relasiclass.percobaan1;

/**
 *
 * @author WINDOWS 11
 */
public class Laptop {
    private String merk;
    private Processor proc;

    // Constructor default
    public Laptop() {
    }

    // Constructor berparameter
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    // Setter & Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    // Method info
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}