/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv01;

/**
 *
 * @author kolla
 */
public class Farm {
    public static void main(String[] args) {
        int pocetHus = 5;
        System.out.println("Pocet hus: " + pocetHus);
        int pocetKraliku = 4;
        System.out.println("Pocet kraliku: " + pocetKraliku);
        
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = (pocetHus * 2) + (pocetKraliku * 4);
        
        System.out.println("Na farme je " + pocetZvirat + " zvirat a maji " + pocetNohou + " nohou.");
    }
}
