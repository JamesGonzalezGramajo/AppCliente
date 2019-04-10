/* codigo de usuario */

package AnalisisUsuarios;
import gui.Frames.VentanaIniciarSesion;
import java_cup.runtime.*;
import static AnalisisUsuarios.sym.*;





%% //separador de area

/* opciones y declaraciones de jflex */

%public
%class usuarioLexer
%cup
%cupdebug
%line
%column

MENOR_Q = ["<"]
MAYOR_Q = [">"]
DIAGONAL = ["/"]

GUION = ["-"]
GUION_BAJO = ["_"]
DOLLAR = ["$"]

IDENTIFICADOR = ({GUION_BAJO}|{GUION}|{DOLLAR})([:jletterdigit:]|{GUION_BAJO}|{GUION}|{DOLLAR})+
PASSWORD = ([:jletterdigit:])+

SEPARADORES = [\r\t\f]
ENTER = [\n]
ESPACIO = [ ]+






%{
    
    public usuarioLexer(java.io.Reader in, VentanaIniciarSesion ventana){
        this.zzReader = in;
        this.ventana = ventana;
    
    }

    VentanaIniciarSesion ventana;


    private Symbol symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn+1);
	}



	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn+1, value);
	}

	private void error(String message) {
		String completeMessage = "Error lexico en posición " + (yycolumn + 1) + " --- "+ (yyline + 1) + " : " + message;
		System.out.println(completeMessage);
        
	}



    
 
%}

%% // separador de areas

/* reglas lexicas */
<YYINITIAL> {


//Separadores
    {SEPARADORES} {/* ignoramos */}


//Enter
    {ENTER} {/*Ignoramos*/}


//Espacio
    {ESPACIO} {/*Ignoramos*/}

//Simbolos Necesarios
    {MENOR_Q} {return symbol(MENOR_Q, yytext());}
    {MAYOR_Q} {return symbol(MAYOR_Q, yytext());}
    {DIAGONAL} {return symbol(DIAGONAL, yytext());}

//Palabras para Etiquetas
    "usuario" {return symbol(USUARIO, yytext());}
    "nombre" {return symbol(NOMBRE, yytext());}
    "contrasenia" {return symbol(CONTRASENIA, yytext());}

//Valores de parametros
   {IDENTIFICADOR} {return symbol(IDENTIFICADOR,yytext());} 
   {PASSWORD} {return symbol(PASSWORD, yytext());} 


}
//Todo lo que sea diferente o no cumpla con las reglas lexicas anteriores
    [^] {return symbol(error, yytext());}
    <<EOF>> {return symbol(EOF);}


