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
public class SentenceFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte jmeno ditete: ");
        String jmeno = sc.nextLine();
        System.out.print("Zadejte rok narozeni ditete: ");
        int rok = Integer.parseInt(sc.nextLine());
        System.out.print("Zadejte oznaceni tridy, do ktere vase dite chodi: ");
        char oznaceni = sc.next().charAt(0);

        System.out.println();

        int vek = 2022 - rok;
        int trida = vek - 6;

        System.out.println("Dite " + jmeno + " ma " + vek + " let a chodi do " + trida + "." + oznaceni + ".");
    }
}
