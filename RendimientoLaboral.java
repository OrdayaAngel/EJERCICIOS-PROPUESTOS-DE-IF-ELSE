import java.util.Scanner;

public class RendimientoLaboral {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese puntualidad de 0 a 20: ");
        int puntualidad = entrada.nextInt();

        System.out.print("Ingrese productividad de 0 a 20: ");
        int productividad = entrada.nextInt();

        System.out.print("Ingrese cumplimiento de 0 a 20: ");
        int cumplimiento = entrada.nextInt();

        double promedio = (puntualidad + productividad + cumplimiento) / 3.0;

        if (puntualidad < 0 || puntualidad > 20 || productividad < 0 || productividad > 20 || cumplimiento < 0 || cumplimiento > 20) {
            System.out.println("Datos invalidos");
        } else {
            if (promedio >= 18) {
                System.out.println("Rendimiento excelente");
            } else if (promedio >= 14) {
                System.out.println("Rendimiento bueno");
            } else if (promedio >= 11) {
                System.out.println("Rendimiento regular");
            } else {
                System.out.println("Rendimiento deficiente");
            }

            System.out.println("Promedio: " + promedio);
        }

        entrada.close();
    }
}