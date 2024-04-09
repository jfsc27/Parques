package co.edu.uniquindio.poo;

import java.util.Collection;

public class Zona {
    public String nombre;
    private final Collection<FiguraGeometrica> figuraGeometrica;
    private Material material;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<FiguraGeometrica> getFiguraGeometrica() {
        return figuraGeometrica;
    }
    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }

    
    public Zona(String nombre, Collection<FiguraGeometrica> figuraGeometrica, Material material) {
        this.nombre = nombre;
        this.figuraGeometrica = figuraGeometrica;
        this.material = material;
    }

    
}
