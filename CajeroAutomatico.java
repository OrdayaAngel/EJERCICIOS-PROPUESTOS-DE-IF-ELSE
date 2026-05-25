import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pinCorrecto = 1234;
        int intentos = 0;
        boolean acceso = false;

        double saldo = 1500;
        double limiteDiario = 1000;

        while (intentos < 3 && acceso == false) {
            System.out.print("Ingrese PIN: ");
            int pin = entrada.nextInt();

            if (pin == pinCorrecto) {
                acceso = true;
            } else {
                intentos++;
                System.out.println("PIN incorrecto");
            }
        }

        if (acceso == false) {
            System.out.println("Tarjeta bloqueada");
        } else {
            System.out.println("1. Retirar dinero");
            System.out.println("2. Verificar saldo");
            System.out.print("Elija una opcion: ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese monto a retirar: ");
                double monto = entrada.nextDouble();

                if (monto <= 0) {
                    System.out.println("Monto invalido");
                } else if (monto > saldo) {
                    System.out.println("Fondos insuficientes");
                } else if (monto > limiteDiario) {
                    System.out.println("Supera el limite diario");
                } else {
                    saldo = saldo - monto;
                    System.out.println("Retiro exitoso");
                    System.out.println("Saldo actual: " + saldo);
                }

            } else if (opcion == 2) {
                System.out.println("Saldo actual: " + saldo);
            } else {
                System.out.println("Opcion invalida");
            }
        }

        entrada.close();
    }
}