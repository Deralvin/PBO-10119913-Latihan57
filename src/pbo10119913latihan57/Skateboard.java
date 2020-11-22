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
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard(){
        System.out.println("Skateboard");
    }

    public double getBoardLeght(){
        return myBoardLength;
    }

    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    } 
}
