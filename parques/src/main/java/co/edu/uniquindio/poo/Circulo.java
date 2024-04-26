package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {
    public double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
        assert radio >0 : "Error, no se puede crear un radio negativo";
    }

    @Override
    public double calcularArea() {
        return (Math.PI *radio *radio);
    }
}
