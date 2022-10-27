package main;

import main.flyweight.ComputadoraFlyweight;
import main.model.Computadora;

public class Main {
    public static void main(String[] args) {

        ComputadoraFlyweight flyweight = new ComputadoraFlyweight();

        Computadora mac1 = flyweight.obtenerComputadora(16, 500);
        Computadora windows1 = flyweight.obtenerComputadora(2, 256);
        Computadora mac2 = flyweight.obtenerComputadora(16, 500);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(windows1.toString());
    }
}
