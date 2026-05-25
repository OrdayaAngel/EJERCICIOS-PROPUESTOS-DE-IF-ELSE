    import java.util.Scanner;

public class TarifasTransporte {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese distancia en km: ");
        double distancia = entrada.nextDouble();

        System.out.print("Ingrese tipo de usuario estudiante/adulto/adulto_mayor: ");
        String tipoUsuario = entrada.next();

        System.out.print("Ingrese horario normal/nocturno: ");
        String horario = entrada.next();

        double costoBase;
        double descuento = 0;
        double recargo = 0;
        double total;

        if (distancia <= 0) {
            System.out.println("Distancia invalida");
        } else {
            costoBase = distancia * 2.00;

            if (tipoUsuario.equalsIgnoreCase("estudiante")) {
                descuento = costoBase * 0.50;
            } else if (tipoUsuario.equalsIgnoreCase("adulto")) {
                descuento = 0;
            } else if (tipoUsuario.equalsIgnoreCase("adulto_mayor")) {
                descuento = costoBase * 0.30;
            } else {
                System.out.println("Tipo de usuario invalido");
                entrada.close();
                return;
            }

            if (horario.equalsIgnoreCase("nocturno")) {
                recargo = costoBase * 0.20;
            } else if (horario.equalsIgnoreCase("normal")) {
                recargo = 0;
            } else {
                System.out.println("Horario invalido");
                entrada.close();
                return;
            }

            total = costoBase - descuento + recargo;

            System.out.println("Costo base: " + costoBase);
            System.out.println("Descuento: " + descuento);
            System.out.println("Recargo: " + recargo);
            System.out.println("Total a pagar: " + total);
        }

        entrada.close();
    }
}