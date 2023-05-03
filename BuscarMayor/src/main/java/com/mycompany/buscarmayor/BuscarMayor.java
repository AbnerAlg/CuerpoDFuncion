/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscarmayor;

/**
 *
 * @author abner
 */
public class BuscarMayor {
    

    public static int buscarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }


    public static void main(String[] args) {
       int[] numeros = {3, 5, 2, 8, 1, 6};
        int mayor = buscarMayor(numeros);
        System.out.println("El mayor número del array es: " + mayor);
    }
}
