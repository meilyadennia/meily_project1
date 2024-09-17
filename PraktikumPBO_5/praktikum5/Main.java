/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Honda Civic Turbo";
        mobil.kecepatan = 200;
        mobil.jumlahpintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Scoopy";
        motor.kecepatan = 115;
        motor.jenismesin = "110cc eSP";
        motor.tampilkanInfo();
    }
}
