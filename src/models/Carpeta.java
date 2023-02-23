package models;

import java.io.File;
import java.io.IOException;

public class Carpeta {
    private String ruta;
    public Carpeta(String ruta) {
        this.ruta = ruta;
    }

    public void contarPalabraEnArchivos(String palabra) throws IOException {
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();
        int total = 0;
        for (File archivo : archivos) {
            if (archivo.isFile() && esArchivoDeTexto(archivo)) {
                Archivo archivoTexto = new Archivo(archivo.getAbsolutePath());
                int cantidad = archivoTexto.contarPalabra(palabra);
                System.out.println("Archivo " + archivo.getName() + ": " + cantidad + " veces");
                total += cantidad;
            }
        }
        System.out.println("Total de veces que aparece la palabra en la carpeta: " + total);
    }

    private boolean esArchivoDeTexto(File archivo) {
        String nombre = archivo.getName();
        return nombre.endsWith(".txt") || nombre.endsWith(".xml") || nombre.endsWith(".json") || nombre.endsWith(".csv");
    }
}