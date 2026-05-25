import java.util.Scanner;

public class LoginConBloqueo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";

        int intentos = 0;
        boolean acceso = false;

        while (intentos < 3 && acceso == false) {
            System.out.print("Ingrese usuario: ");
            String usuario = entrada.next();

            System.out.print("Ingrese contrasena: ");
            String contrasena = entrada.next();

            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                acceso = true;
                System.out.println("Acceso correcto");
            } else {
                intentos++;
                System.out.println("Datos incorrectos");
            }
        }

        if (acceso == false) {
            System.out.println("Cuenta bloqueada");
        }

        entrada.close();
    }
}