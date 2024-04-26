package co.edu.uniquindio.poo;

public class Zona {
    public String nombre;
    private final FiguraGeometrica figuraGeometrica;
    private Material material;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FiguraGeometrica getFiguraGeometrica() {
        return figuraGeometrica;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Zona(String nombre, FiguraGeometrica figuraGeometrica, Material material) {
        this.nombre = nombre;
        this.figuraGeometrica = figuraGeometrica;
        this.material = material;
    }

    public double calcularValor (){
        return (figuraGeometrica.calcularArea() * material.getValorMetroCuadrado());
    }
   
}
