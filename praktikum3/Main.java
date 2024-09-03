/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String[] args) {
        Mobil Nona = new Mobil ("Porsche", "911 GT3 RS", 2015, "Merah");
        
        Nona.displayinfo();
        System.out.println("\nSetelah diubah warnanya");
        Nona.setWarna("Pink");
        Nona.displayinfo();
    }
}
