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
public class Vehicle {
     private String myBrand;
    private String myModel;

    public Vehicle(){

    }

    public String getBrand(){
        return myBrand;
    }

    public void setBrand(String brand){
        this.myBrand = brand;
    }

    public String getModel(){
        return myModel;
    }

    public void setModel(String model){
        this.myModel = model;
    }
}