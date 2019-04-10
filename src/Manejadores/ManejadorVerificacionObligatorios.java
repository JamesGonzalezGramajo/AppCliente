package Manejadores;

import Modelos.SitioWeb;
import gui.Frames.VentanaAppCliente;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author james
 */
public class ManejadorVerificacionObligatorios {

    public static String ID = "";
    public static String TITULO = "";
    public static String SITIO = "";
    public static String PADRE = "";
    public static String USUARIO_CREACION = "";
    public static String FECHA_CREACION = "";
    public static String FECHA_MODIFICACION = "";
    public static String USUARIO_MODIFICACION = "";
    public static String PAGINA = "";
    public static String CLASE = "";

    public static ArrayList<String> listadoEtiquetas = new ArrayList<>();
    public static ArrayList<SitioWeb> listadoSitiosWeb = new ArrayList<>();

    public static void limpiarParametros() {
        ID = "";
        TITULO = "";
        SITIO = "";
        PADRE = "";
        USUARIO_CREACION = "";
        FECHA_CREACION = "";
        FECHA_MODIFICACION = "";
        USUARIO_MODIFICACION = "";
        PAGINA = "";
        CLASE = "";

        listadoEtiquetas.clear();

        System.out.println("Se limpiaron los parametros/atributos/etiquetas");

    }

    // == Estructuras ==========================================================
    public static String generarEstructuraSitioWeb() {

        String estructura = "<sitioWeb>\n"
                + "     <id> " + ID + " </id>\n"
                + "     <usuarioCreacion> " + USUARIO_CREACION + " </usuarioCreacion>\n"
                + "     <fechaCreacion> " + FECHA_CREACION + " </fechaCreacion>\n"
                + "     <usuarioModificacion> " + USUARIO_MODIFICACION + " </usuarioModificacion>\n"
                + "     <fechaModificacion> " + FECHA_MODIFICACION + " </fechaModificacion>\n"
                + "</sitioWeb>\n\n";

        return estructura;
        
    }

    public static String generarEstructuraPaginaWeb() {

        String etiquetas = "";

        String estructura1 = "<paginaWeb>\n"
                + "     <id> " + ID + " </id>\n"
                + "     <sitio> " + SITIO + " </sitio>\n"
                + "     <padre> " + PADRE + " </padre>\n"
                + "     <titulo> [" + TITULO + "] </titulo>\n"
                + "     <usuarioCreacion> " + USUARIO_CREACION + " </usuarioCreacion>\n"
                + "     <fechaCreacion> " + FECHA_CREACION + " </fechaCreacion>\n"
                + "     <usuarioModificacion> " + USUARIO_MODIFICACION + " </usuarioModificacion>\n"
                + "     <fechaModificacion> " + FECHA_MODIFICACION + " </fechaModificacion>\n";

        for (int i = 0; i < listadoEtiquetas.size(); i++) {

            etiquetas = etiquetas + "     <etiqueta> " + listadoEtiquetas.get(i) + " </etiqueta>\n";

        }

        String estructura2 = "</paginaWeb>\n\n";

        return estructura1 + etiquetas + estructura2;

    }
    
    

    public static String generarEstructuraModificarPaginaWeb() {

        String etiquetas = "";

        String estructura1 = "<modificarPaginaWeb>\n"
                + "     <id> " + ID + " </id>\n"
                + "     <sitio> " + SITIO + " </sitio>\n"
                + "     <padre> " + PADRE + " </padre>\n"
                + "     <titulo> [" + TITULO + "] </titulo>\n"
                + "     <usuarioCreacion> " + USUARIO_CREACION + " </usuarioCreacion>\n"
                + "     <fechaCreacion> " + FECHA_CREACION + " </fechaCreacion>\n"
                + "     <usuarioModificacion> " + USUARIO_MODIFICACION + " </usuarioModificacion>\n"
                + "     <fechaModificacion> " + FECHA_MODIFICACION + " </fechaModificacion>\n";

        for (int i = 0; i < listadoEtiquetas.size(); i++) {

            etiquetas = etiquetas + "     <etiqueta> " + listadoEtiquetas.get(i) + " </etiqueta>\n";

        }

        String estructura2 = "</modificarPaginaWeb>\n\n";

        return estructura1 + etiquetas + estructura2;

    }

    public static String generarEstructuraBorrarSitioWeb() {
        String estructura = "<borrarSitioWeb>\n"
                + "     <id> " + ID + " </id>\n"
                + "</borrarSitioWeb>\n";
        return estructura;
    }

    public static String generarEstructuraBorrarPaginaWeb() {
        String estructura = "<borrarPaginaWeb>\n"
                + "     <id> " + ID + " </id>\n"
                + "</borrarPaginaWeb>\n";
        return estructura;
    }

    // == Mostrar listados =====================================================
    public static void imprimirListadoEtiquetas() {

        System.out.println("========= Listado de etiquetas ===========");
        if (listadoEtiquetas.isEmpty()) {
            System.out.println("No hay etiquetas para esta accion");
        } else {

            for (int i = 0; i < listadoEtiquetas.size(); i++) {
                System.out.println("  > " + listadoEtiquetas.get(i));
            }
        }
        System.out.println("==========================================");
    }

    public static void imprimirListadoSitiosWeb() {

        System.out.println("========= Listado de Sitios ===========");

        if (listadoSitiosWeb.isEmpty()) {
            System.out.println("No hay etiquetas para esta accion");
        } else {

            for (int i = 0; i < listadoSitiosWeb.size(); i++) {
                System.out.println(i + 1);
                System.out.println("  >  " + listadoSitiosWeb.get(i).getId());
                System.out.println("  >  " + listadoSitiosWeb.get(i).getUsuarioCreacion());
                System.out.println("  >  " + listadoSitiosWeb.get(i).getFechaCreacion());
                System.out.println("  >  " + listadoSitiosWeb.get(i).getUsuarioModificacion());
                System.out.println("  >  " + listadoSitiosWeb.get(i).getFechaModificacion());
                System.out.println("\n");
            }
        }
        System.out.println("==========================================");
    }

    // == Verificaciones =======================================================
    public static boolean verificarObligatorios_NuevoSitioWeb() {
        if (ID.equals("")) {
            return false;
        } else {

            System.out.println("verificarObligatorios_NuevoSitioWeb > ID = " + ID);

            if (USUARIO_CREACION.equals("")) {
                USUARIO_CREACION = VentanaAppCliente.USUARIO_ACTUAL;

            }
            System.out.println("verificarObligatorios_NuevoSitioWeb > USUARIO_CREACION = " + USUARIO_CREACION);

            if (FECHA_CREACION.equals("")) {
                LocalDate ahora = LocalDate.now();
                String fechaActual = ahora.toString();
                FECHA_CREACION = fechaActual;
            }
            System.out.println("verificarObligatorios_NuevoSitioWeb > FECHA_CREACION = " + FECHA_CREACION);

            if (FECHA_MODIFICACION.equals("")) {
                FECHA_MODIFICACION = "No";
            }

            if (USUARIO_MODIFICACION.equals("")) {
                USUARIO_MODIFICACION = "No";
            }

            return true;
        }
    }

    public static boolean verificarObligatorios_BorrarSitioWeb() {
        if (ID.equals("")) {
            return false;
        } else {
            //nada
        }

        return true;
    }

    public static boolean verificarObligatorios_NuevaPagina() {
        if (ID.equals("")) {
            return false;
        } else if (SITIO.equals("")) {
            return false;
        } else if (PADRE.equals("")) {
            return false;
        }

        System.out.println("verificarObligatorios_NuevaPagina > ID = " + ID);
        System.out.println("verificarObligatorios_NuevaPagina > SITIO = " + SITIO);
        System.out.println("verificarObligatorios_NuevaPagina > PADRE = " + PADRE);

        if (TITULO.equals("")) {
            TITULO = "No";
        }
        System.out.println("verificarObligatorios_NuevaPagina > TITULO = " + TITULO);

        if (USUARIO_CREACION.equals("")) {
            USUARIO_CREACION = VentanaAppCliente.USUARIO_ACTUAL;

        }
        System.out.println("verificarObligatorios_NuevaPagina > USUARIO_CREACION = " + USUARIO_CREACION);

        if (FECHA_CREACION.equals("")) {
            LocalDate ahora = LocalDate.now();
            String fechaActual = ahora.toString();
            FECHA_CREACION = fechaActual;
        }
        System.out.println("verificarObligatorios_NuevaPagina > FECHA_CREACION = " + FECHA_CREACION);

        if (FECHA_MODIFICACION.equals("")) {
            FECHA_MODIFICACION = "No";
        }

        if (USUARIO_MODIFICACION.equals("")) {
            USUARIO_MODIFICACION = "No";
        }

        return true;
    }

    public static boolean verificarObligatorios_ModificarPagina() {
        if (ID.equals("")) {
            return false;
        }

        System.out.println("verificarObligatorios_ModificarPagina > ID = " + ID);
        System.out.println("verificarObligatorios_ModificarPagina > SITIO = " + SITIO);
        System.out.println("verificarObligatorios_ModificarPagina > PADRE = " + PADRE);
        System.out.println("verificarObligatorios_ModificarPagina > TITULO = " + TITULO);
        System.out.println("verificarObligatorios_ModificarPagina > USUARIO_CREACION = " + USUARIO_CREACION);
        System.out.println("verificarObligatorios_ModificarPagina > FECHA_CREACION = " + FECHA_CREACION);
        return true;
    }

    public static boolean verificarObligatorios_BorrarPagina() {
        if (ID.equals("")) {
            return false;
        } else {
            //nada
        }

        return true;
    }

}
