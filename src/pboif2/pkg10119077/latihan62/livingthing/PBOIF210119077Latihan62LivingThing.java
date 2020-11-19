/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan62.livingthing;

/**
 *
 * @author RAF
 * Nama             : Ridhwan Anwar Fauzan
 * NIM              : 10119077
 * Kelas            : IF - 2
 * Deskripsi        : Living Thing
 */
public class PBOIF210119077Latihan62LivingThing {

    
    public static void main(String[] args) {
        Human objHuman=new Human();
        objHuman.setNama("Rizki Adam Kurniawan");
        
        objHuman.walk(objHuman.getNama());
        objHuman.breath(objHuman.getNama());
        objHuman.eat(objHuman.getNama());
    }
    
}
