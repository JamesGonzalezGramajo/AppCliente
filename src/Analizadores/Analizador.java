package Analizadores;

import gui.Frames.VentanaAppCliente;
import java.io.StringReader;

/**
 *
 * @author james
 */
public class Analizador {

    public static void analizar(String texto,VentanaAppCliente ventanaAppCliente) {

        try {
            StringReader reader = new StringReader(texto);

            miLexer lex = new miLexer(reader,ventanaAppCliente);
            parser sin = new parser(lex,ventanaAppCliente);
            sin.parse();
        } catch (Exception ex) {
            System.out.println("                    ERRORSOTE: Analizar"+ex);
        }

    }

}
