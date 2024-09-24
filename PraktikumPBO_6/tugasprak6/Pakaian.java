/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak6;

/**
 *
 * @author ASUS
 */
public class Pakaian extends Produk {
    public Pakaian (String nama, int harga, int persendiskon) {
        super(nama, harga, persendiskon);
    }
    @Override
    public double hitungdiskon() {
        return harga * persendiskon / 100;
    }
}
