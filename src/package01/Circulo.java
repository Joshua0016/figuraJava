package package01;

public class Circulo extends Figuras {
    private double radio;
    private double pi;

    Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;

    }

    void calcuarArea() {
        double Cuadrado = Math.pow(radio, 2);
        double Area = pi * Cuadrado;
        MostrarCalculo(Area);
    }

    // V=4/3pi (r)^3
    void calcularVolumen() {
        double volumen = (4.0 / 3.0 * pi) * Math.pow(radio, 3);
        MostrarCalculo(volumen);
    }

}
