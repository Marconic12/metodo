package models.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta miCuenta = null;
        Cliente cliente = null;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese su ID: ");
                    String id = sc.nextLine();
                    System.out.print("Ingrese saldo inicial: ");
                    double saldoInicial = sc.nextDouble();

                    cliente = new Cliente(nombre, id);
                    miCuenta = new Cuenta(cliente, saldoInicial, 1234);
                    System.out.println("Cuenta creada para " + nombre + " con saldo: " + saldoInicial);
                    break;

                case 2:
                    if (miCuenta != null) {
                        System.out.print("Ingrese monto a depositar: ");
                        double deposito = sc.nextDouble();
                        miCuenta.AgregarMonto(deposito);
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;

                case 3:
                    if (miCuenta != null) {
                        System.out.print("Ingrese monto a retirar: ");
                        double retiro = sc.nextDouble();
                        double retirado = miCuenta.RetirarMonto(retiro);
                        System.out.println("Se retiró: " + retirado);
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;

                case 4:
                    if (miCuenta != null) {
                        System.out.println("Saldo actual: " + miCuenta.getSaldoInicial());
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        sc.close();
    }
}