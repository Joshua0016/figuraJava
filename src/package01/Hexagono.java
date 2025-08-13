package package01;

//A= Perimetro * Apotema / 2
public class Hexagono extends Figuras {
    private double lado;
    private double apotema;
    private double altura;
    private double area;

    public Hexagono(double lado, double apotema, double altura) {
        this.lado = lado;
        this.apotema = apotema;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double perimetro = lado * 6;
        this.area = (perimetro * apotema) / 2;
        System.out.println("El area del Hexagono es : " + area);

    }

    @Override
    public void calcularVolumen() {
        if (area == 0.0) {
            System.out.println("Debes calcular el area del Hexágono primero");
            return;
        }
        double volumen = area * altura;
        System.out.println("El volumen del Hexagono es :" + volumen);

    }

}
