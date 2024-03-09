/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jajargenjang1;

/**
 *
 * @author Lenovo
 */
public class Jajargenjang1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
    
        int alas = 5;
        int tinggi = 8;
        
        // Menghitung luas jajargenjang
        int luas = alas * tinggi;
        System.out.println("Luas jajargenjang: " + luas);
        
        // Menghitung keliling jajargenjang (dalam kasus ini, panjang sisi sejajar adalah sama dengan alas)
        int keliling = 2 * (alas + tinggi);
        System.out.println("Keliling jajargenjang: " + keliling);
    }
}

