/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jajargenjang1;

/**
 *
 * @author Lenovo
 */
public class menghitungluasjajargenjang {
    public class HitungLuasJajargenjang {
    private double alas;
    private double tinggi;

    public HitungLuasJajargenjang(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return alas * tinggi;
    }

    public static void main(String[] args) {
        double alas = 5; // contoh nilai alas jajargenjang
        double tinggi = 8; // contoh nilai tinggi jajargenjang

        HitungLuasJajargenjang jajargenjang = new HitungLuasJajargenjang(alas, tinggi);
        double luas = jajargenjang.hitungLuas();

        System.out.println("Luas jajargenjang dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
    }
    }
}
