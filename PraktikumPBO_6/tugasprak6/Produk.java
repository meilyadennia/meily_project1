/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author ASUS
 */
public class Produk {
    String nama;
    int harga;
    int persendiskon;
    
    public Produk(String nama, int harga, int persendiskon) {
        this.nama = nama;
        this.harga = harga;
        this.persendiskon = persendiskon;
    } 
    public double hitungdiskon() {
        return 0;
    }
    public double HargaSetelahDiskon() {
        return harga - hitungdiskon();
    }
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public int getPersenDiskon() {
        return persendiskon;
    }
}
