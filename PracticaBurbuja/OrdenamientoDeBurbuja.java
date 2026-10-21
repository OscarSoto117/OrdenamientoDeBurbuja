/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientodeburbuja;
import java.util.Arrays;
/**
 *
 * @author oscar
 */
public class OrdenamientoDeBurbuja {
    public static void main(String[] args) {
        
        // --- CASO 1: ARREGLO COMPLETAMENTE DESORDENADO ---
        int[] arregloDesordenado = {64, 34, 25, 12, 22, 11, 90};
        int[] copiaTradicional1 = arregloDesordenado.clone();
        int[] copiaMejorado1 = arregloDesordenado.clone();

        System.out.println("=== CASO 1: DESORDENADO ===");
        System.out.println("Estado inicial: " + Arrays.toString(arregloDesordenado));
        
        ordenamientoBurbuja(copiaTradicional1);
        ordenamientoBurbujaMejorado(copiaMejorado1);
        
        System.out.println("Estado final:   " + Arrays.toString(copiaMejorado1));
        System.out.println();

        // --- CASO 2: ARREGLO PARCIALMENTE ORDENADO ---
        int[] arregloCasiOrdenado = {1, 2, 4, 3, 5, 6, 7};
        int[] copiaTradicional2 = arregloCasiOrdenado.clone();
        int[] copiaMejorado2 = arregloCasiOrdenado.clone();

        System.out.println("=== CASO 2: PARCIALMENTE ORDENADO ===");
        System.out.println("Estado inicial: " + Arrays.toString(arregloCasiOrdenado));
        
        ordenamientoBurbuja(copiaTradicional2);
        ordenamientoBurbujaMejorado(copiaMejorado2);
        
        System.out.println("Estado final:   " + Arrays.toString(copiaMejorado2));
    }

    // Metodo Burbuja Tradicional con contadores
    public static void ordenamientoBurbuja(int[] arreglo) {
        int tamanoArreglo = arreglo.length;
        int pasadas = 0;
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < tamanoArreglo - 1; i++) {
            pasadas++;
            for (int j = 0; j < tamanoArreglo - 1; j++) {
                comparaciones++;
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    intercambios++;
                }
            }
        }

        System.out.println("Burbuja Tradicional -> Pasadas: " + pasadas + ", Comparaciones: " + comparaciones + ", Intercambios: " + intercambios);
    }

    // Metodo Burbuja Mejorado con bandera y contadores
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int tamanoArreglo = arreglo.length;
        boolean huboIntercambio;
        int pasadas = 0;
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < tamanoArreglo - 1; i++) {
            pasadas++;
            huboIntercambio = false;

            // Rango reducido con 1 - i
            for (int j = 0; j < tamanoArreglo - 1 - i; j++) {
                comparaciones++;
                if (arreglo[j] > arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    huboIntercambio = true;
                    intercambios++;
                }
            }

            // Corte anticipado si no hubo intercambios
            if (!huboIntercambio) {
                break;
            }
        }
        System.out.println("Burbuja Mejorado -> Pasadas: " + pasadas + ", Comparaciones: " + comparaciones + ", Intercambios: " + intercambios);
    }
}
