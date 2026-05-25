import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese lado 1: ");
        double lado1 = entrada.nextDouble();

        System.out.print("Ingrese lado 2: ");
        double lado2 = entrada.nextDouble();

        System.out.print("Ingrese lado 3: ");
        double lado3 = entrada.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Lados invalidos");
        } else {
            if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Triangulo equilatero");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triangulo isosceles");
                } else {
                    System.out.println("Triangulo escaleno");
                }
            } else {
                System.out.println("No forma un triangulo");
            }
        }

        entrada.close();
    }
}