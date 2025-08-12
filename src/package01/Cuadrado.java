package package01;

public class Cuadrado extends Figuras {
    private double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    void calcularArea() {
        double area = Math.pow(lado, 2);
        MostrarCalculo(area);
    }

    void calcularVolumen() {
        double volumen = Math.pow(lado, 3);
        MostrarCalculo(volumen);
    }
}
