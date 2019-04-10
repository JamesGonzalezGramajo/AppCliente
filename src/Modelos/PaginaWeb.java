package Modelos;

import java.util.ArrayList;

/**
 *
 * @author james
 */
public class PaginaWeb {

    private String id;
    private String titulo;
    private String sitio;
    private String padre;
    private String usuarioCreacion;
    private String fechaCreacion;
    private String usuarioModificacion;
    private String fechaModificacion;
    private ArrayList<String> listaEtiquetas;

    public PaginaWeb() {
    }

    public PaginaWeb(String id, String titulo, String sitio, String padre, String usuarioCreacion, String fechaCreacion, String usuarioModificacion, String fechaModificacion, ArrayList<String> listaEtiquetas) {
        this.id = id;
        this.titulo = titulo;
        this.sitio = sitio;
        this.padre = padre;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaModificacion = fechaModificacion;
        this.listaEtiquetas = listaEtiquetas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public ArrayList<String> getListaEtiquetas() {
        return listaEtiquetas;
    }

    public void setListaEtiquetas(ArrayList<String> listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }

    
    
    

}
