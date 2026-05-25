import java.util.Scanner;

public class RiesgoCrediticio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese ingreso mensual: ");
        double ingreso = entrada.nextDouble();

        System.out.print("Ingrese historial crediticio bueno/regular/malo: ");
        String historial = entrada.next();

        System.out.print("Ingrese edad: ");
        int edad = entrada.nextInt();

        if (ingreso <= 0 || edad <= 0) {
            System.out.println("Datos invalidos");
        } else {
            if (historial.equalsIgnoreCase("bueno")) {
                if (ingreso >= 3000 && edad >= 21 && edad <= 65) {
                    System.out.println("Riesgo bajo");
                } else {
                    System.out.println("Riesgo medio");
                }
            } else if (historial.equalsIgnoreCase("regular")) {
                if (ingreso >= 2500 && edad >= 21 && edad <= 65) {
                    System.out.println("Riesgo medio");
                } else {
                    System.out.println("Riesgo alto");
                }
            } else if (historial.equalsIgnoreCase("malo")) {
                System.out.println("Riesgo alto");
            } else {
                System.out.println("Historial invalido");
            }
        }

        entrada.close();
    }
}