package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraGeometrica{
    public double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
        assert lado >0 : "El lado no puede ser negativo";
    }

    public double calcularArea () {
        return (lado * lado);
    }
}
