/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicionbubble;

/**
 *
 * @author daves
 */
public class BubbleSort  {

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i].compareTo(a[j]) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void show(Comparable[] a) {
        for (Comparable element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (less(a, j + 1, j)) {
                    exch(a, j + 1, j);
                    swapped = true;
                    show(a); 
                }
            }
            if (!swapped) {
                break; 
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {8, 4, 3, 9, 1};
        System.out.println("Arreglo original: ");
        show(arr);

        BubbleSort.sort(arr);

        System.out.println("Arreglo ordenado: ");
        show(arr);
    }
}
