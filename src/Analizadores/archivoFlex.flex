/* codigo de usuario */

package Analizadores;
import gui.Frames.VentanaAppCliente;
import java_cup.runtime.*;
import static Analizadores.sym.*;





%% //separador de area

/* opciones y declaraciones de jflex */

%public
%class miLexer
%cup
%cupdebug
%line
%column

MENOR_Q = ["<"]
MAYOR_Q = [">"]
DIAGONAL = ["/"]

COMILLA = ["\""]

IGUAL = ["="]

GUION = ["-"]
GUION_BAJO = ["_"]
DOLLAR = ["$"]

IDENTIFICADOR = ({GUION_BAJO}|{GUION}|{DOLLAR})([:jletterdigit:]|{GUION_BAJO}|{GUION}|{DOLLAR})+

DATO = ([:jletterdigit:]|{GUION_BAJO}|{GUION}|{DOLLAR}|"("|")"|"+"|"*"|":"|";"|","|"."|"@"|"#"|"%"|"&")+

ENTERO = [0-9]+

URL = ((http(s)?)(":")("/")("/"))?([:jletterdigit:])+(".")([:jletterdigit:])+(".")([:jletterdigit:] | [-] | [_] | [$]|"+"|"*"|"'"|":"|","|";"|"@"|"%"|"&"|"/"|"#"|"?"|"¿"|"¡"|"!"|".")+

SEPARADORES = [\r\t\f]
ENTER = [\n]
ESPACIO = [ ]+






%{

    VentanaAppCliente ventana;
    
    public miLexer(java.io.Reader in, VentanaAppCliente ventana){
        this.zzReader = in;
        this.ventana = ventana;
    
    }




    private Symbol symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn+1);
	}



	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn+1, value);
	}

	private void error(String message) {
		String completeMessage = "Error lexico en posición " + (yycolumn + 1) + " --- "+ (yyline + 1) + " : " + message;
		System.out.println(completeMessage);
        ventana.escribirEnTextAreaDeErroresLexicos("Error en:  \n      Linea: " + yyline + "\n     Columna: "+yycolumn+"\n      Simbolo: "+ yytext() +"");       
	}

    private String quitarCorchetes (String texto){
        
        int tamanio = texto.length(); 
        
        String textoSinCorchetes = texto.substring(1, tamanio-1);
        
        System.out.println("Texto sin corchetes: " + textoSinCorchetes);

        return textoSinCorchetes;
    
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

    {COMILLA} {return symbol(COMILLA, yytext());}

    {IGUAL} {return symbol(IGUAL, yytext());}

    //{A_CORCHETE} {return symbol(A_CORCHETE, yytext());}
    //{C_CORCHETE} {return symbol(C_CORCHETE, yytext());}


//Palabras para Etiquetas




    (A|a)(T|t)(R|r)(I|i)(B|b)(U|u)(T|t)(O|o) {return symbol(ATRIBUTO, yytext());}
    (A|a)(T|t)(R|r)(I|i)(B|b)(U|u)(T|t)(O|o)(S|s) {return symbol(ATRIBUTOS, yytext());}

    (A|a)(C|c)(C|c)(I|i)(O|o)(N|n) {return symbol(ACCION, yytext());}
    (A|a)(C|c)(C|c)(I|i)(O|o)(N|n)(E|e)(S|s) {return symbol(ACCIONES, yytext());}

    (N|n)(O|o)(M|m)(B|b)(R|r)(E|e) {return symbol(NOMBRE, yytext());}
    
    (P|p)(A|a)(R|r)(A|a)(M|m)(E|e)(T|t)(R|r)(O|o) {return symbol(PARAMETRO, yytext());}
    (P|p)(A|a)(R|r)(A|a)(M|m)(E|e)(T|t)(R|r)(O|o)(S|s) {return symbol(PARAMETROS, yytext());}
    
    (E|e)(T|t)(I|i)(Q|q)(U|u)(E|e)(T|t)(A|a) {return symbol(ETIQUETA, yytext());}
    (E|e)(T|t)(I|i)(Q|q)(U|u)(E|e)(T|t)(A|a)(S|s) {return symbol(ETIQUETAS, yytext());}

    (V|v)(A|a)(L|l)(O|o)(R|r) {return symbol(VALOR, yytext());}
    



//Acciones
    "NUEVO_SITIO_WEB" {return symbol(NUEVO_SITIO_WEB, yytext());}
    "BORRAR_SITIO_WEB" {return symbol(BORRAR_SITIO_WEB, yytext());}

    "NUEVA_PAGINA" {return symbol(NUEVA_PAGINA, yytext());}
    "MODIFICAR_PAGINA" {return symbol(MODIFICAR_PAGINA, yytext());}
    "BORRAR_PAGINA" {return symbol(BORRAR_PAGINA, yytext());}

    "AGREGAR_COMPONENTE" {return symbol(AGREGAR_COMPONENTE, yytext());}
    "MODIFICAR_COMPONENTE" {return symbol(MODIFICAR_COMPONENTE, yytext());}
    "BORRAR_COMPONENTE" {return symbol(BORRAR_COMPONENTE, yytext());}

//Parametros
    "ID" {return symbol(ID, yytext());}
    "USUARIO_CREACION" {return symbol(USUARIO_CREACION, yytext());}
    "FECHA_CREACION" {return symbol(FECHA_CREACION, yytext());}
    "FECHA_MODIFICACION" {return symbol(FECHA_MODIFICACION, yytext());}
    "USUARIO_MODIFICACION" {return symbol(USUARIO_MODIFICACION, yytext());}
    "TITULO" {return symbol(TITULO, yytext());}
    "SITIO" {return symbol(SITIO, yytext());}
    "PADRE" {return symbol(PADRE, yytext());}
    "PAGINA" {return symbol(PAGINA, yytext());}
    "CLASE" {return symbol(CLASE, yytext());}

//Componentes
    "[TITULO]" {return symbol(TITULO, quitarCorchetes( yytext() ) );}
    "[PARRAFO]" {return symbol(PARRAFO, quitarCorchetes( yytext() ) );}
    "[IMAGEN]" {return symbol(IMAGEN, quitarCorchetes( yytext() ) );}
    "[VIDEO]" {return symbol(VIDEO, quitarCorchetes( yytext() ) );}
    "[MENU]" {return symbol(MENU, quitarCorchetes( yytext() ) );}

//Atributos de los Componentes

    //TITULO
        "TEXTO" {return symbol(TEXTO, yytext());}
        "ALINEACION" {return symbol(ALINEACION, yytext());}
        "[CENTRAR]" {return symbol(CENTRAR,quitarCorchetes( yytext() ) );}
        "[IZQUIERDA]" {return symbol(IZQUIERDA, quitarCorchetes( yytext() ) );}
        "[DERECHA]" {return symbol(DERECHA, quitarCorchetes( yytext() ) );              }
        "[JUSTIFICAR]" {return symbol(JUSTIFICAR, quitarCorchetes( yytext() ) );}

    //PARRAFO
        "TEXTO" {return symbol(TEXTO, yytext());}
        "ALINEACION" {return symbol(ALINEACION, yytext());}
        "CENTRAR" {return symbol(CENTRAR, yytext());}
        "IZQUIERDA" {return symbol(IZQUIERDA, yytext());}
        "DERECHA" {return symbol(DERECHA, yytext());}
        "JUSTIFICAR" {return symbol(JUSTIFICAR, yytext());}
        "COLOR" {return symbol(COLOR, yytext());}
    //IMAGEN 
        "ORIGEN" {return symbol(ORIGEN, yytext());}
        "ALINEACION" {return symbol(ALINEACION, yytext());}
        "ALTURA" {return symbol(ALTURA, yytext());}
        "ANCHO" {return symbol(ANCHO, yytext());}

    //VIDEO
        "ORIGEN" {return symbol(ORIGEN, yytext());}
        "ALTURA" {return symbol(ALTURA, yytext());}
        "ANCHO" {return symbol(ANCHO, yytext());}


    //MENU
        "PADRE" {return symbol(PADRE, yytext());}
        //"ETIQUETAS" {System.out.printf("ETIQUETAS [%s]" , yytext());}






//Valores de parametros

// 

   ("[#")([a-fA-F]|[0-9]){6}("]") {return symbol(HEXADECIMAL, quitarCorchetes( yytext() ) );} 
   ("["){ENTERO}("]") {return symbol(ENTERO, yytext());} 
   ("[") ([12]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\d|3[01]))  ("]")  {return symbol(FECHA, quitarCorchetes( yytext() ) );} 
   ("["){URL}("]") {return symbol(URL,  quitarCorchetes( yytext() ) );} 
   ("["){IDENTIFICADOR}("]")  {return symbol(IDENTIFICADOR, quitarCorchetes( yytext() ) );} 
   ("\""){IDENTIFICADOR}("\"")  {return symbol(ID_ETIQUETA, quitarCorchetes( yytext() ) );} 
   {DATO} {return symbol(DATO, yytext());} 
   ("[")([:jletterdigit:]|" "|{GUION_BAJO}|{GUION}|{DOLLAR}|"+"|"*"|":"|";"|","|"."|"@"|"#"|"%"|"&")+("]") {return symbol(ORACION, quitarCorchetes(yytext()));}





}
//Todo lo que sea diferente o no cumpla con las reglas lexicas anteriores
    [^] { error("*"); return symbol(error, yytext());}
    <<EOF>> {return symbol(EOF);}


