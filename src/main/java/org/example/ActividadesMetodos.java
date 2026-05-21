package org.example;

import java.util.Scanner;

public class ActividadesMetodos{

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarDiasSemana() {
        System.out.println("Lunes");
        System.out.println("Martes");
        System.out.println("Miércoles");
        System.out.println("Jueves");
        System.out.println("Viernes");
        System.out.println("Sábado");
        System.out.println("Domingo");
    }

    public static void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mostrar mensaje de saludo
        mostrarMensaje("Bienvenido a la actividad de métodos en Java");

        // Mostrar dias de la semana
        System.out.println("\nDías de la semana:");
        mostrarDiasSemana();

        // Solicitar número al usuario
        System.out.print("\nIngrese un número para ver su tabla de multiplicar: ");

        // Guardar el número ingresado
        int numero = input.nextInt();

        // Mostrar tabla de multiplicar
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        imprimirTablaMultiplicar(numero);

        // Cerrar Scanner
        input.close();
    }
}

