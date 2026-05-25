import java.util.Scanner;

public class BecasUniversitarias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese promedio: ");
        double promedio = entrada.nextDouble();

        System.out.print("Tiene ingresos familiares bajos? true/false: ");
        boolean ingresosBajos = entrada.nextBoolean();

        System.out.print("Ingrese numero de cursos desaprobados: ");
        int cursosDesaprobados = entrada.nextInt();

        if (promedio < 0 || promedio > 20 || cursosDesaprobados < 0) {
            System.out.println("Datos invalidos");
        } else {
            if (promedio >= 16 && ingresosBajos && cursosDesaprobados == 0) {
                System.out.println("Recibe beca completa");
            } else if (promedio >= 16 && (ingresosBajos || cursosDesaprobados <= 1)) {
                System.out.println("Recibe media beca");
            } else {
                System.out.println("No recibe beca");
            }
        }

        entrada.close();
    }
}