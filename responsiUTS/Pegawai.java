/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    //Konstruktor kelas Pegawai
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    //Metode getter & setter untuk setiap atribut
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaProduk(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    public int getGaji() {
        return gaji;
    }
    public void setHarga(int gaji) {
        this.gaji = gaji;
    }
    //Membuat method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Gaji Pegawai : " + gaji);
    }
}