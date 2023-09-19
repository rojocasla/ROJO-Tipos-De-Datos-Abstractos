/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class ClaseMain {
    
    public static void main(String[] args) {
        
             PilaEnlazada pila = new PilaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Insertar elemento en la pila");
            System.out.println("2. Eliminar elemento de la pila");
            System.out.println("3. Obtener elemento superior de la pila");
            System.out.println("4. Verificar si la pila esta vacia");
            System.out.println("5. Obtener tamano de la pila");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar en la pila: ");
                    Object elementoInsertar = scanner.next();
                    pila.push(elementoInsertar);
                    System.out.println("Elemento insertado correctamente en la pila.");
                    break;
                case 2:
                    if (!pila.isEmpty()) {
                        Object elementoEliminar = pila.pop();
                        System.out.println("Elemento eliminado de la pila: " + elementoEliminar);
                    } else {
                        System.out.println("La pila esta vacia. No se puede eliminar ningun elemento.");
                    }
                    break;
                case 3:
                    if (!pila.isEmpty()) {
                        Object elementoSuperior = pila.peek();
                        System.out.println("Elemento superior de la pila: " + elementoSuperior);
                    } else {
                        System.out.println("La pila esta vacia. No hay elementos para mostrar.");
                    }
                    break;
                case 4:
                    if (pila.isEmpty()) {
                        System.out.println("La pila esta vacia.");
                    } else {
                        System.out.println("La pila no esta vacia.");
                    }
                    break;
                case 5:
                    int tamaño = pila.size();
                    System.out.println("Tamano de la pila: " + tamaño);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

            System.out.println("---------------------------------------");
        } while (opcion != 0);

        scanner.close();
    }
        
        
    }
    

