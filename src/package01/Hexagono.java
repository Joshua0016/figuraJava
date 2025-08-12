package package01;

//A= Perimetro * Apotema / 2
public class Hexagono extends Figuras {
    private double lado;
    private double apotema;
    private double altura;

    Hexagono(double lado, double apotema, double altura) {
        this.lado = lado;
        this.apotema = apotema;
        this.altura = altura;
    }

    void calcularArea() {
        double perimetro = lado * 6;
        double area = (perimetro * apotema) / 2;
        MostrarCalculo(area);
        calcularVolumen(area);
    }

    void calcularVolumen(double area) {
        if (area == 0.0) {
            return;
        }
        double volumen = area * altura;
        MostrarCalculo(volumen);

    }
}
