/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author ASUS
 */
public class Produk {
    private String namaProduk;
    private int harga;
    
    //Konstruktor kelas Produk
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    //Metode getter & setter untuk setiap atribut
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    //Membuat method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga Produk : " + harga);
    }
}
