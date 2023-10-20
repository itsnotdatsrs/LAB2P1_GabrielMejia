/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_gabrielmejia;

/**
 *
 * @author zkull
 */
import java.util.Scanner;

public class LAB2P1_GabrielMejia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu de Ejercicios");
            System.out.println("1= Ejercicio 1");
            System.out.println("2= Ejercicio 2");
            System.out.println("3= Ejercicio 3");
            System.out.println("4= salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                EvaluarTriangulo(scanner);
            } else if (opcion == 2) {
                CalcularArea(scanner);
            } else if (opcion == 3) {
                Clasificar(scanner);
            } else if (opcion == 4) {
                System.out.println("Saliendo.");
                salir = true;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }

    private static void EvaluarTriangulo(Scanner scanner) {
        System.out.println("Longitud de los lados");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        if (Triangulo(lado1, lado2, lado3)) {
            System.out.println("Estos forman un triangulo");
        } else {
            System.out.println("Estos no forman un triangulo");
        }
    }

    private static boolean Triangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    private static void CalcularArea(Scanner scanner) {
        System.out.println("Area de Figura:");
        System.out.println("1= Rectangulo");
        System.out.println("2= Triangulo");
        System.out.println("3= Circulo");
        System.out.print("Elige una opcion: ");
        int OpcionFigura = scanner.nextInt();

        if (OpcionFigura == 1) {
            AreaRectangulo(scanner);
        } else if (OpcionFigura == 2) {
            AreaTriangulo(scanner);
        } else if (OpcionFigura == 3) {
            AreaCirculo(scanner);
        } else {
            System.out.println("Opcion no valida");
        }
    }

    private static void AreaRectangulo(Scanner scanner) {
        System.out.print("base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.print("altura del rectangulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("el area del rectangulo es: " + area);
    }

    private static void AreaTriangulo(Scanner scanner) {
        System.out.print("base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("altura del triangulo: ");
        double altura = scanner.nextDouble();
        double area = 0.5 * base * altura;
        System.out.println("area del triangulo es: " + area);
    }

    private static void AreaCirculo(Scanner scanner) {
        System.out.print("radio del circulo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("area del circulo es: " + area);
    }

    private static void Clasificar(Scanner scanner) {
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }

        if (Primo(numero)) {
            System.out.println("El numero es primo.");
        } else {
            System.out.println("El numero no es primo.");
        }
    }

    private static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}