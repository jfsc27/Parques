package co.edu.uniquindio.poo;

public class Triangulo extends FiguraGeometrica {
    public double base;
    public double altura;

    
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
}
