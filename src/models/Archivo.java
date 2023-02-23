package models;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {

    private String ruta;

    public Archivo(String ruta) {
        this.ruta = ruta;
    }

    public int contarPalabra(String palabra) throws IOException {
        int contador = 0;
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        String linea;
        while ((linea = lector.readLine()) != null) {
            int indice = -1;
            while ((indice = linea.indexOf(palabra, indice + 1)) != -1) {
                contador++;
            }
        }
        lector.close();
        return contador;
    }
}