import models.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la ruta completa de la carpeta:");
        String rutaCarpeta = scanner.nextLine();
        System.out.println("Ingrese la palabra a buscar:");
        String palabra = scanner.nextLine();
        scanner.close();

        Carpeta carpeta = new Carpeta(rutaCarpeta);
        carpeta.contarPalabraEnArchivos(palabra);
    }
}