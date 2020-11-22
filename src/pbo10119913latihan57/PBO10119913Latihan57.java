/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan57;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class PBO10119913Latihan57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle speda = new Bicycle();
        speda.setBrand("Trek Bike");
        speda.setModel("7.4FX");
        System.out.println("Brand            : " + speda.getBrand());
        System.out.println("Model            : " + speda.getModel());
        speda.setGearCount(23);
        System.out.println("Jumlah Gear      : " + speda.getGearCount());

        System.out.println();

        Skateboard skate = new Skateboard();
        skate.setBrand("Ally Skate");
        skate.setModel("Rocket");
        System.out.println("Brand            : " + skate.getBrand());
        System.out.println("Model            : " + skate.getModel());
        skate.setBoardLength(54.5);
        System.out.println("Panjangnya board : " + skate.getBoardLeght());
    }
    
}
