package package01;

public class Rectangulo extends Figuras {
    private double largo;
    private double altura;
    private double ancho;

    public Rectangulo(double base, double altura, double ancho) {
        this.altura = altura;
        this.largo = base;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        double area = largo * altura;
        System.out.println("El area del Rectángulo es :" + area);
    }

    @Override
    public void calcularVolumen() {
        double volumen = largo * ancho * altura;
        System.out.println("El volumen del Rectángulo es :" + volumen);
    }
}
