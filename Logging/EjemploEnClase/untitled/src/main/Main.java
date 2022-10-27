package main;

import main.logging.ListaPromedio;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {

    public static  final  Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        ListaPromedio listaPromedioMayorA5 = null;
        ListaPromedio listaPromedioMayorA10 = null;
        ListaPromedio listaPromedioVacia = null;

        try {
            listaPromedioMayorA5 = new ListaPromedio(Arrays.asList(1,2,3,4,5,6));
            listaPromedioMayorA10 = new ListaPromedio(Arrays.asList(1,2,3,4,5,6, 7, 8));
        }
    }
}
