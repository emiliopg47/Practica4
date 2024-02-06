import java.util.Scanner;

public class Principal {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduzca cuantos usuarios desea crear: ");
        int n = sc.nextInt();

        Usuario[] usuarios = new Usuario[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el nombre del usuario " + (i + 1) + ": ");
            String nombre = sc.next();
            System.out.print("Introduzca los apellidos del usuario " + (i + 1) + ": ");
            String apellidos = sc.next();
            System.out.print("Introduzca el email del usuario " + (i + 1) + ": ");
            String email = sc.next();
            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        for (Usuario usuario : usuarios) {
            System.out.println();
            usuario.mostrarDatos();
        }
    }
}