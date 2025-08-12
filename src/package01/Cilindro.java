package package01;

public class Cilindro extends Figuras {
    double pi;
    double radio;
    double altura;

    Cilindro(double pi, double radio, double altura) {
        this.pi = pi;
        this.radio = radio;
        this.altura = altura;
    }

    void calcularArea() {
        double areaLateral = 2 * pi * radio * altura;
        double areaBases = 2 * pi * Math.pow(radio, 2);
        double areaTotal = areaLateral + areaBases;
        MostrarCalculo(areaTotal);
    }

    void calcularVolumen() {
        double cuadrado = Math.pow(radio, 2);
        double volumen = pi * cuadrado * altura;
        MostrarCalculo(volumen);
    }

}
