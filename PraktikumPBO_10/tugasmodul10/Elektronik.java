/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul10;

/**
 *
 * @author ASUS
 */
public class Elektronik implements Pembayaran {

    @Override
    public double hitungPajak(double harga) {
        return harga - harga * 10/100;
    }
    public double hargaAsli(double harga) {
        return harga;
    }
}
