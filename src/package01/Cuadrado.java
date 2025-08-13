package package01;

public class Cuadrado extends Figuras {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es :" + area);
    }

    @Override
    public void calcularVolumen() {
        double volumen = Math.pow(lado, 3);
        System.out.println("El volumen del cuadrado es : " + volumen);
    }

}
