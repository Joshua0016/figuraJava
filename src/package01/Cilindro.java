package package01;

public class Cilindro extends Figuras {
    double pi;
    double radio;
    double altura;

    public Cilindro(double pi, double radio, double altura) {
        this.pi = pi;
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double areaLateral = 2 * pi * radio * altura;
        double areaBases = 2 * pi * Math.pow(radio, 2);
        double areaTotal = areaLateral + areaBases;
        System.out.println("El area del cilindro es :" + areaTotal);
    }

    @Override
    public void calcularVolumen() {
        double cuadrado = Math.pow(radio, 2);
        double volumen = pi * cuadrado * altura;
        System.out.println("El volumen del cilindro es :" + volumen);
    }

}
