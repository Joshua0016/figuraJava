package package01;

public class Rectangulo extends Figuras {
    private double largo;
    private double altura;
    private double ancho;

    Rectangulo(double base, double altura, double ancho) {
        this.altura = altura;
        this.largo = base;
        this.ancho = ancho;
    }

    void CalcularArea() {
        double area = largo * altura;
        MostrarCalculo(area);
    }

    void calcularVolumen() {
        double area = largo * ancho * altura;
        MostrarCalculo(area);
    }
}
