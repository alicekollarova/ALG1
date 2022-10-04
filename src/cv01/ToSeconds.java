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
public class ToSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // vstup
        System.out.print("Zadejte pocet hodin: ");
        int hodiny = Integer.parseInt(sc.nextLine());
        System.out.print("Zadejte pocet minut: ");
        int minuty = Integer.parseInt(sc.nextLine());
        System.out.print("Zadejte pocet sekund: ");
        int sekundy = Integer.parseInt(sc.nextLine());
        
        // zpracování
        int casZavodnika = (hodiny * 3600) + (minuty * 60) + sekundy;
        
        System.out.println();
        
        // výstup
        System.out.format("Cas zavodnika: %d s\n", casZavodnika);
    }
}
