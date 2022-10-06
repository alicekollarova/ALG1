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
public class BanknotesCounts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // vstup
        System.out.print("Zadejte castku v Kc: ");
        int castka = Integer.parseInt(sc.nextLine());

        // zpracování
        int sto, padesat, dvacet, deset, pet, dva, jedna, rem;
        sto = castka / 100;
        rem = castka % 100;
        padesat = rem / 50;
        rem = rem % 50;
        dvacet = rem / 20;
        rem = rem % 20;
        deset = rem / 10;
        rem = rem % 10;
        pet = rem / 5;
        rem = rem % 5;
        dva = rem / 2;
        rem = rem % 2;
        jedna = rem / 1;

        // výstup
        System.out.format("Vycetka platidel: %d stokorun/a/y, %d padesatikorun/a/y, %d dvacetikorun/a/y, %d desetikorun/a/y, "
                + "%d petikorun/a/y, %d dvoukorun/a/y, %d jednokorun/a/y\n", sto, padesat, dvacet, deset, pet, dva, jedna);
    }
}
