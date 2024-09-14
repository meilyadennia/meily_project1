/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul4;

/**
 *
 * @author user
 */
public class Pekerja extends Manusia {
    //Atribut tambahan gaji
    private int gaji;
    
    //Constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        //Memanggil constructor dari kelas Manusia
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    //Getter dan setter untuk atribut gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    @Override
    public String toString() {
        return "Identitas Pekerja" +
               "\nNama : " + getNama() +
               "\nUsia : " + usia +
               "\nPekerjaan : " + pekerjaan +
               "\nGaji : " + gaji;
    }
}
