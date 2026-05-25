import java.util.Scanner;

public class EvaluadorNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Es multiplo de 3 y 5");
        } else if (numero % 3 == 0) {
            System.out.println("Es multiplo de 3");
        } else if (numero % 5 == 0) {
            System.out.println("Es multiplo de 5");
        } else {
            System.out.println("No es multiplo de 3 ni de 5");
        }

        entrada.close();
    }
}