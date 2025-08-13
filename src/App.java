/*Crea una jerarquía simple de clases Figura: Circulo, Cuadrado, Rectángulo
y Hexágono con un método calcuarArea y volumen
Aplica polimorfismo para imprimir el área de diferentes figuras desde una lista común * 
 */

import package01.Cilindro;
import package01.Circulo;
import package01.Cuadrado;
import package01.Figuras;
import package01.Hexagono;
import package01.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Figuras[] figuras = {
                new Circulo(5, 3.14),
                new Cilindro(3.14, 7, 8),
                new Cuadrado(6),
                new Hexagono(8, 7, 10),
                new Rectangulo(3, 10, 4)
        };

        System.out.println("Area de las figuras");
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].calcularArea();
        }
        System.out.println("Volumen de las figuras");
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].calcularVolumen();
        }

    }
}
