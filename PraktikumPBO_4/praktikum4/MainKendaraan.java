/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class MainKendaraan {
    
    public static void main(String[] args) {
        Kendaraan karina = new Kendaraan("Porsche Taycan", 260, "Electric motors");
        Mobil karin = new Mobil("Porsche Taycan", 260, "Electric motors", 4);
        karina.tampilkanInfoKendaraan();
        karin.tampilkanInfoMobil();
    }
}
