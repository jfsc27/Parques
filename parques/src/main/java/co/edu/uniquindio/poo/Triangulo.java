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
        assert base > 0 : "La base no puede ser negativa";
        this.altura = altura;
        assert altura > 0 : "La altura no puede ser negativa";
    }

    public double calcularArea () {
        return (base * altura)/2;
    }

    
}
