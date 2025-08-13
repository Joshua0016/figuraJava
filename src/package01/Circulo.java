package package01;

public class Circulo extends Figuras {
    private double radio;
    private double pi;

    public Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;

    }

    @Override
    public void calcularArea() {
        double Cuadrado = Math.pow(radio, 2);
        double area = pi * Cuadrado;
        System.out.println("El area del circulo es :" + area);

    }

    // V=4/3pi (r)^3
    @Override
    public void calcularVolumen() {
        double volumen = (4.0 / 3.0 * pi) * Math.pow(radio, 3);
        System.out.println("El volumen del circulo es :" + volumen);
    }

}
