package main.flyweight;

import main.model.Computadora;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFlyweight {

    private static Map<String, Computadora> computadoraMap = new HashMap<>();

    public Computadora obtenerComputadora(int ram, int disco) {

        String clave = "key: " + ram + ":" + disco;

        // si la computadora ya existe
        if (!computadoraMap.containsKey(clave)) {

            Computadora computadora = new Computadora(ram, disco);

            computadoraMap.put(clave, computadora);

            System.out.println("Computadora creada");

            return computadoraMap.get(clave);

        } else {
            System.out.println("Computadora obtenida");
            return computadoraMap.get(clave);
        }
    }
}
