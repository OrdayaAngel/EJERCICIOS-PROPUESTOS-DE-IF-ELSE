import java.util.Scanner;

public class ContrasenaSeguraTexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese contrasena: ");
        String contrasena = entrada.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(caracter)) {
                tieneSimbolo = true;
            }
        }

        if (contrasena.length() < 8) {
            System.out.println("Falta minimo 8 caracteres");
        }

        if (tieneMayuscula == false) {
            System.out.println("Falta una mayuscula");
        }

        if (tieneNumero == false) {
            System.out.println("Falta un numero");
        }

        if (tieneSimbolo == false) {
            System.out.println("Falta un simbolo");
        }

        if (contrasena.length() >= 8 && tieneMayuscula && tieneNumero && tieneSimbolo) {
            System.out.println("Contrasena segura");
        } else {
            System.out.println("Contrasena no segura");
        }

        entrada.close();
    }
}