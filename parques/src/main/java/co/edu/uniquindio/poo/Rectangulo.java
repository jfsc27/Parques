package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica {
    public double ancho;
    public double largo;

    
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }


    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        assert ancho > 0 : "El ancho no puede ser negativo";
        this.largo = largo;
        assert largo >0 : "El largo no puede ser negativo";
    }

    public double calcularAreaRectangulo () {
        return (ancho * largo);
    }
}
