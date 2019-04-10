
package Manejadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author james
 */
public class ManejadorUsuarios {
    
    public static void escribirDatosUsuarioEnArchivo(String usuario, String contrasenia) {
        try {
            FileWriter fstream = new FileWriter("usuarios.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);

            out.write("<usuario> \n");
            out.write(" <nombre> " +usuario+" </nombre>\n");
            out.write(" <contrasenia> " +contrasenia+" </contrasenia>\n");
            out.write("</usuario> \n\n");
            

            out.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    public static String extraerContenidoDeArchivo(String archivo) {
        String texto = "";
        try {

            String cadena;
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufer = new BufferedReader(fileReader);
            while ((cadena = bufer.readLine()) != null) {
                texto = texto + cadena + "\n";
            }
            bufer.close();

        } catch (Exception e) {
            System.out.println("ERROR");
        }
        return texto;
    }
    
    
}
