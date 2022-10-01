/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv01;

import java.util.Scanner;

/**
 *
 * @author kolla
 */
public class Cv01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int soucet = a + b;
        int soucin = a * b;
        
        System.out.println(soucet);
        System.out.println(soucin);
    }
    
}
