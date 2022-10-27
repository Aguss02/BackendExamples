package main.com.dto;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFlyweightFactory {

    private Map<String, Computadora> computadoraMap = new HashMap<>();

    public Computadora crearComputadora(Integer ram, Integer discoDuro){

        String key = "ram: " + ram + " disco duro: " +  discoDuro;

        if(!computadoraMap.containsKey(key)){

            Computadora computadora = new Computadora(ram, discoDuro);
            System.out.println("Computadora creada");
            computadoraMap.put(key,computadora);

        } else {

            System.out.println("Computadora encontrada");

        }

        return computadoraMap.get(key);

    }
}
