import java.util.Scanner;

public class ImpuestoProgresivo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese ingreso: ");
        double ingreso = entrada.nextDouble();

        double impuesto;

        if (ingreso <= 0) {
            System.out.println("Ingreso invalido");
        } else {
            if (ingreso <= 1000) {
                impuesto = ingreso * 0.05;
            } else if (ingreso <= 5000) {
                impuesto = ingreso * 0.10;
            } else {
                impuesto = ingreso * 0.20;
            }

            System.out.println("Ingreso: " + ingreso);
            System.out.println("Impuesto a pagar: " + impuesto);
        }

        entrada.close();
    }
}