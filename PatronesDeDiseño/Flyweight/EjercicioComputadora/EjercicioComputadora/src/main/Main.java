package main;

import main.com.dto.Computadora;
import main.com.dto.ComputadoraFlyweightFactory;

public class Main {
    public static void main(String[] args) {

        ComputadoraFlyweightFactory computadoraFlyweightFactory = new ComputadoraFlyweightFactory();
        Computadora mac1 = computadoraFlyweightFactory.crearComputadora(16,500);
       // Computadora mac2 = computadoraFlyweightFactory.crearComputadora(16,500);
        Computadora windows1 = computadoraFlyweightFactory.crearComputadora(2,128);
       // Computadora windows2 = computadoraFlyweightFactory.crearComputadora(2,128);

        System.out.println(mac1.toString());
        System.out.println(windows1.toString());
    }
}
