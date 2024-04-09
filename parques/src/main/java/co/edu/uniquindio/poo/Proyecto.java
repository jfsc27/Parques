package co.edu.uniquindio.poo;

import java.util.Collection;

public class Proyecto {
    public String nombre;
    public double costoTotal;
    private final Collection<ParqueInfantil> listaParquesInfantiles;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCostoTotal() {
        return costoTotal;
    }
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    public Collection<ParqueInfantil> getListaParquesInfantiles() {
        return listaParquesInfantiles;
    }

    public Proyecto(String nombre, double costoTotal, Collection<ParqueInfantil> listaParquesInfantiles) {
        this.nombre = nombre;
        this.costoTotal = costoTotal;
        this.listaParquesInfantiles = listaParquesInfantiles;
    }
 
}

