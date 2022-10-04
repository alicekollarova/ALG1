/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv01;

/**
 *
 * @author kolla
 */
public class Sentence {
    public static void main(String[] args) {
        String jmeno = "Filip";
        int rok = 2009;
        char oznaceni = 'A';
        
        int vek = 2022 - rok;
        int trida = vek - 6;
        
        System.out.println("Dite " + jmeno + " ma " + vek + " let a chodi do " + trida + "." + oznaceni + ".");
    }
}
