package AnalisisUsuarios;

import gui.Frames.VentanaIniciarSesion;
import java.io.StringReader;

/**
 *
 * @author james
 */
public class AnalizadorUsuarios {

    public static void analizarUsuarios(String texto,VentanaIniciarSesion ventana) {

        try {
            StringReader reader = new StringReader(texto);

            usuarioLexer lex = new usuarioLexer(reader);
            parser sin = new parser(lex,ventana);
            sin.parse();
        } catch (Exception ex) {
            System.out.println("                    ERRORSOTE: Analizar Usuarios" + ex);
        }

    }

}
