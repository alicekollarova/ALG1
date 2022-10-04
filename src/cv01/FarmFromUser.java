/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv01;

import java.util.Scanner;

/**
 *
 * @author kolla
 */
public class FarmFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Zadejte pocet hus: ");
        int pocetHus = Integer.parseInt(sc.nextLine());
        System.out.println("Pocet hus: " + pocetHus);
        System.out.print("Zadejte pocet kraliku: ");
        int pocetKraliku = Integer.parseInt(sc.nextLine());
        System.out.println("Pocet kraliku: " + pocetKraliku);
        
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = (pocetHus * 2) + (pocetKraliku * 4);
        
        System.out.println();
        
        System.out.println("Na farme je " + pocetZvirat + " zvirat a maji " + pocetNohou + " nohou.");
    }
}
