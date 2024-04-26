package co.edu.uniquindio.poo;

import java.util.Collection;

public class ParqueInfantil {
    public String nombre;
    public String descripcion; 
    private final Collection<Zona> listaZonas;
    private final Municipio municipio;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Collection<Zona> getListaZonas() {
        return listaZonas;
    }
    public Municipio getMunicipio() {
        return municipio;
    }


    public ParqueInfantil(String nombre, String descripcion, Collection<Zona> listaZonas, Municipio municipio) {
        this.nombre = nombre;
        assert nombre != null : "El nombre no puede ser un dato nulo";
        assert nombre != "" : "El nombre no puede estar vacio";
        this.descripcion = descripcion;
        assert descripcion != null : "La descripcion no puede ser un dato nulo";
        assert descripcion != "" : "La descripcion no puede estar vacia";
        this.listaZonas = listaZonas;
        this.municipio = municipio;
    }

    public double calcularValor() {
        return listaZonas
                .stream()
                .mapToDouble(n -> n.calcularValor()).sum() + municipio.getSobrecosto();
    }


}
